package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
 Properties pro;
 
 public ReadConfig() {
	 
	 File src=new File("./Configuration/config.properties");
	 try {
		 FileInputStream fis=new FileInputStream(src);
		 pro=new Properties();
		 
		 pro.load(fis);
	 }catch(Exception e)
	 {
		 System.out.println("exception is" + e.getMessage());
	 }
	 
	
 
 }
 public String getApplicationURL() {
	 
	 String url=pro.getProperty("baseURL");
	 return url;
 }
 public String getEmail() {
	 String email=pro.getProperty("email");
	 return email;
 }
 public String getPassword() {
	 String pass=pro.getProperty("password");
	 return pass;
 }
 public String getChromePath() {
	 String cpath=pro.getProperty("chromepath");
	 return cpath;
 }
 public String getFirefoxpath() {
	 String fpath=pro.getProperty("geckopath");
	 return fpath;
 }
 public String getIEPath() {
	 String iepath=pro.getProperty("iepath");
	 return iepath;
 }
 
 public String getName() {
	 String username=pro.getProperty("name");
	 return username;
 }
 public String getEmailid() {
	 String emailid=pro.getProperty("Emailid");
	 return emailid;
 }
 public String getPasswords() {
	 String pwds=pro.getProperty("passwrd");
	 return pwds;
 }
 public String getCpasswords() {
	 String cpwds=pro.getProperty("cpass");
	 return cpwds;
 }
 
 public String getProjectTitle() {
	 String ptitle=pro.getProperty("PTitle");
	 return ptitle;
 }
 public String getShortBlurb() {
	 String sbb=pro.getProperty("sb");
	 return sbb;
 }
 public String getEnterLoaction() {
	 String Eloc=pro.getProperty("EL");
	 return Eloc;
 }
 public String getNumberOfDays() {
	 String nodays=pro.getProperty("NOB");
	 return nodays;
 }
 public String getFundingGoal() {
	 String fgoal=pro.getProperty("FG");
	 return fgoal;
 }

}
