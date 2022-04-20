package com.xworkz.criminal.dao;

import com.xworkz.CriminalDTO.CriminalDTO;


	public class Criminal implements CriminalDAO  {

		@Override
		public boolean save(CriminalDTO dto) {
			System.out.println("Implementing methods");
			
			return true;
		}
}
