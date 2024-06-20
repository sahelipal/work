package ThePhoneZone;

public class MobileInfo {
	private String mobileName;
	private String imeiNumber;
	private String mobileBrand;
	private double mobilePrice;
	
    public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	
 public MobileInfo(String mobileName, String imeiNumber, String mobileBrand, double mobilePrice) {
		super();
		this.mobileName = mobileName;
		this.imeiNumber = imeiNumber;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
	}
 public double calculateMobilePriceToBePaid() 
	{
	 
	 if(mobilePrice<=0||imeiNumber.length()<15||imeiNumber.length()>15) 
	 {
		 return -1;
	 }
	 else if(!(mobileBrand.equals("Samsung")||mobileBrand.equals("Realme")||mobileBrand.equals("OnePlus")||mobileBrand.equals("Oppo")||mobileBrand.equals("Vivo"))) 
		{
		 return -1;
		}
	 else if(imeiNumber.length()==15) 
			{
				if(mobileBrand.equals("Samsung")) 
				{
					return mobilePrice-(0.02*mobilePrice);
					
				}
				else if(mobileBrand.equals("Realme")) 
				{
					return mobilePrice-(0.06*mobilePrice);
					
				}
				else if(mobileBrand.equals("OnePlus")) 
				{
				return mobilePrice-(0.4*mobilePrice);
				
				}
				else if(mobileBrand.equals("Oppo")) 
				{
					return mobilePrice-(0.05*mobilePrice);
				
				}
				else if(mobileBrand.equals("Vivo")) 
				{
					return mobilePrice-(0.03*mobilePrice);
				
				}
		}
	
		 
		 return -1;
	 
	
	}

}
