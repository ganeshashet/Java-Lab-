class Mobile
{
  String Mobilemodel;
  String MobileCompany;
  Double MobilePrice;
 public void Addmobile(String Mmodel,String Mcompany,double Mprice)
 {
  Mobilemodel=Mmodel;
  MobileCompany=Mcompany;
  MobilePrice=Mprice;
  }
 public void Mdisplay()
{
 System.out.println(Mobilemodel+" "+MobileCompany+" price is "+MobilePrice);
}
}