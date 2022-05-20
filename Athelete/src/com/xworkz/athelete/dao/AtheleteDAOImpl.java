package com.xworkz.athelete.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.athelete.connection.DBUConnection;
import com.xworkz.athelete.dto.AtheleteDTO;

public class AtheleteDAOImpl implements AtheleteDAO  {

	@Override
	public boolean save(AtheleteDTO dto)  {

	String insertQuery = "insert into athelete(name,sports,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary) values(?,?,?,?,?,?,?,?,?,?,?,?);"                       
	
	try (Connection sqlConnection = DBUtilities.getConnection();
		PreparedStatement preparedStatement = sqlConnection.prepareStatement(insertQuery))  {
		
		
		preparedStatement.setString(1, dto.getName());
		preparedStatement.setString(2, dto.getSports());
		preparedStatement.setString(3, dto.getNoOfGames());
		preparedStatement.setString(4, dto.getCountry());
		preparedStatement.setInt(5, dto.getLevel());
		preparedStatement.setString(6, dto.getOlympics());
		preparedStatement.setInt(7, dto.getAge());
		preparedStatement.setString(8, dto.getRetired());
		preparedStatement.setString(9, dto.getCoachName());
		preparedStatement.setInt(10, dto.getTotalMedals());
		preparedStatement.setBoolean(11, dto.isFit());
		preparedStatement.setDouble(12, dto.getSalary());
		
		int rowsAffected = preparedStatement.executeUpdate();		
		System.out.print("Row affected are- %d%n",rowAffected);
		
		return true;	
	}  catch (SQLException e)  {
		e.printStackTrace();
	}
	 return false;
}

	@Override
	public boolean saveList (List<AtheleteDTO> list)  {
		
		Iterator<AtheleteDTO> itr = list.iterator();
		
		while(itr.hasNext())  {
			save(itr.next());
			
			return true;
		}
	     return false;
	}
	

	@Override
	public  Set<AtheleteDTO>  displayTable()  {
		
		String displayQuery  = "select * from athelete";
		
		try (Connection sqlConnection = DBUtilities.getConnection();
				PreparedStatement preparedStatement = sqlConnection.prepareStatement(displayQuery))  {
				
			ResultSet resultSet = preparedStatement.executeQuery();
			
			Set<AtheleteDTO> set = new TreeSet<>();
	
	        while (resultSet.next())  {
	        	
	        	Integer id = resultSet.getInt(1);
	        	String name = resultSet.getString(2);
	        	String sports = resultSet.getString(3);
	        	Integer noOfGames= resultSet.getInt(4);
	        	String country = resultSet.getString(5);
	        	String level = resultSet.getString(6);
	        	boolean olympics = resultSet.getBoolean(7);
	        	Integer age = resultSet.getInt(8);
	        	boolean retired = resultSet.getBoolean(9);
	        	String coachName = resultSet.getString(10);
	        	Integer totalMedals = resultSet.getInt(11);
	        	boolean fit = resultSet.getBoolean(12);
	        	Double salary = resultSet.getDouble(13);

	        	AtheleteDTO dto = new AtheleteDTO(id,name,sports,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary);
	        	set.add(dto);
	        }
	           return set;
		}  catch (SQLException e)  {
			e.printStackTrace();
		}
		return Collections.emptySet();
	}        	
	        	
		@Override
		public AtheleteDTO findById(int id) {
			String sql = "Select*from athelete_details where id=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {
				preState.setInt(1, id);
				ResultSet resultSet = preState.executeQuery();
				System.out.println(resultSet);

				while (resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name = resultSet.getString(2);
					String sports = resultSet.getString(3);
					Integer noOfGames = resultSet.getInt(4);
					String country = resultSet.getString(5);
					String level = resultSet.getString(6);
					String olympics = resultSet.getString(7);
					Integer age = resultSet.getInt(8);
					boolean retired = resultSet.getBoolean(9);
					String coachName = resultSet.getString(10);
					Integer totalMedals = resultSet.getInt(11);
					boolean fit = resultSet.getBoolean(12);
					Double salary = resultSet.getDouble(13);

					AtheleteDTO dto = new AtheleteDTO(id1, name, sports, noOfGames, country, level, olympics, age, retired, coachName,
							totalMedals, fit, salary);
					return dto;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return null;
		}

		@Override
		public AtheleteDTO findByNameAndId(String name, int id) {
			String sql = "Select*From athelete_details where id=? AND name=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {

				preState.setInt(1, id);
				preState.setString(2, name);
				ResultSet resultSet = preState.executeQuery();

				while (resultSet.next()) {
					Integer id3 = resultSet.getInt(1);
					String name1 = resultSet.getString(2);
					String sports = resultSet.getString(3);
					Integer noOfGames = resultSet.getInt(4);
					String country = resultSet.getString(5);
					String level = resultSet.getString(6);
					String olympics = resultSet.getString(7);
					Integer age = resultSet.getInt(8);
					boolean retired = resultSet.getBoolean(9);
					String coachName = resultSet.getString(10);
					Integer totalMedals = resultSet.getInt(11);
					boolean fit = resultSet.getBoolean(12);
					Double salary = resultSet.getDouble(13);

					AtheleteDTO dto = new AtheleteDTO(id3, name1, sports, noOfGames, country, level, olympics, age, retired, coachName,
							totalMedals, fit, salary);
					return dto;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public AtheleteDTO findByNameAndSports(String name, String sports) {
			String sql = "Select*From athelete_details where name=? AND sports=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {

				preState.setString(1, name);
				preState.setString(2, sports);
				ResultSet resultSet = preState.executeQuery();

				while (resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name2 = resultSet.getString(2);
					String sports2 = resultSet.getString(3);
					Integer noOfGames = resultSet.getInt(4);
					String country = resultSet.getString(5);
					String level = resultSet.getString(6);
					String olympics = resultSet.getString(7);
					Integer age = resultSet.getInt(8);
					boolean retired = resultSet.getBoolean(9);
					String coachName = resultSet.getString(10);
					Integer totalMedals = resultSet.getInt(11);
					boolean fit = resultSet.getBoolean(12);
					Double salary = resultSet.getDouble(13);

					AtheleteDTO dto = new AtheleteDTO(id1, name2, sports2, noOfGames, country, level, olympics, age, retired, coachName,
							totalMedals, fit, salary);
					return dto;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public AtheleteDTO findByNameAndCountryAndSports(String name, String country, String sports) {
			String sql = "Select*From athelete_details where name=? AND country=? AND sports=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {

				preState.setString(1, name);
				preState.setString(2, country);
				preState.setString(3, sports);
				ResultSet resultSet = preState.executeQuery();

				while (resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name4 = resultSet.getString(2);
					String sports4 = resultSet.getString(3);
					Integer noOfGames = resultSet.getInt(4);
					String country4 = resultSet.getString(5);
					String level = resultSet.getString(6);
					String olympics = resultSet.getString(7);
					Integer age = resultSet.getInt(8);
					boolean retired = resultSet.getBoolean(9);
					String coachName = resultSet.getString(10);
					Integer totalMedals = resultSet.getInt(11);
					boolean fit = resultSet.getBoolean(12);
					Double salary = resultSet.getDouble(13);

					AtheleteDTO dto = new AtheleteDTO(id1, name4, sports4, noOfGames, country4, level, olympics, age, retired, coachName,
							totalMedals, fit, salary);
					return dto;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		public String findCoachNameByNameAndCountryAndSports(String coachName, String name, String country, String sports) {
			String sql = "Select*From athelete_details where coachName=? AND name=? AND country=? AND sports=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {
				preState.setString(1, coachName);
				preState.setString(2, name);
				preState.setString(3, country);
				preState.setString(4, sports);
				ResultSet resultSet = preState.executeQuery();

				while (resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name5 = resultSet.getString(2);
					String sports5 = resultSet.getString(3);
					Integer noOfGames = resultSet.getInt(4);
					String country5 = resultSet.getString(5);
					String level = resultSet.getString(6);
					String olympics = resultSet.getString(7);
					Integer age = resultSet.getInt(8);
					boolean retired = resultSet.getBoolean(9);
					String coachName5 = resultSet.getString(10);
					Integer totalMedals = resultSet.getInt(11);
					boolean fit = resultSet.getBoolean(12);
					Double salary = resultSet.getDouble(13);
					
					
					AtheleteDTO dto = new AtheleteDTO(id1, name5, sports5, noOfGames, country5, level, olympics, age, retired, coachName5,
							totalMedals, fit, salary);
					return dto;
		


					String dto1 = new String(name5);
					return dto1;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		@Override
		public String findNameById(String name,int id) {
			String sql = "Select name,id  from athelete_details where name=? and id=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {
				preState.setString(1, name);
				preState.setInt(2, id);
				ResultSet resultSet = preState.executeQuery();
				System.out.println(resultSet);

				while (resultSet.next()) {
					String name6=resultSet.getString(1);
					int id6 = resultSet.getInt(2);
					
					System.out.println(String.format("%s, %s",name6,id6));
					return  name;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		@Override
		public int id(int id) {
			String sql = "Select id  from athelete_details where id=?";

			try (Connection connection = DBUConnection.getConnection();
					PreparedStatement preState = connection.prepareStatement(sql)) {
				preState.setInt(1, id);
				ResultSet resultSet = preState.executeQuery();
				System.out.println(resultSet);

				while (resultSet.next()) {
					int id1 = resultSet.getInt(1);
					return  id1;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return 1;
		}

		@Override
		public boolean saveList() {
			
			return false;
		}
		
		}
	
	
	