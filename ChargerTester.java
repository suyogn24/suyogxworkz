class ChargerTester{
	
	public static void main (String things);
	{
		
	Charger charger=new Charger("Red";ChargerType MICRO_USB_CHARGER;3;"Samsung";PinType TYPE_C_CHARGER;"C type";"2M";true);
    
	charger about;
	
    System.out.println();
	
	charger.updateColour();
	charger.updateType();
	charger.updateWatts();
	charger.updateBrand();
	charger.updatePintype();
	charger.updateUSB();
	charger.updateWirelength();
	charger.updateWorking();
	
	System.out.println();
	
	charger.updateColour("White");
	charger.updateType(ChargerType.MICRO-USB_CHARGER);
	charger.updateWatts("3W");
	charger.updateBrand("MI");
	charger.updatePintype(PinType.TYPE_C_CHARGER);
	charger.updateUSB("B Type");
	charger.updateWirelength("1M");
	charger.updateWorking(False);
	
	System.out.println();
		
	}
	
}

	
	
	
	
	