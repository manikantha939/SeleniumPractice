package Test.Program;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SystemDateFormat {
	public static void main(String[] args) {
		SystemDateFormat SystemDateFormat=new SystemDateFormat();
//		System.out.println(SystemDateFormat.dateFormat());
//		SystemDateFormat.createFolder("D:/full stack/SQL");
		System.out.println(SystemDateFormat.GetSytemDateAndTime());
	}

	public Map<String,String> dateFormat(){
		Date date=new Date();
		String dateAndTime = date.toString();
		String yyyy = dateAndTime.split(" ")[5];
		String mon = dateAndTime.split(" ")[1];
        String month = String.valueOf(date.getMonth()+1);
		String dd = dateAndTime.split(" ")[2];
		String newDateFormat = String.join("-", dd, mon, yyyy);
		String join = String.join("-", dd, month, yyyy);
		//if we want to return multiple values, we can make use of map
		Map<String,String> result=new HashMap<>();
		result.put("newDateFormat",newDateFormat);
		result.put("join",join);
		return result;
	}

	public void createFolder(String path){
		File file= new File(path);
		int lengthOfPath= path.length();
		int lengthofSubFolder = path.substring(0, path.lastIndexOf('/')).length();
		System.out.println(lengthOfPath+"  -->  "+lengthofSubFolder);
		String res=path.substring(lengthofSubFolder, lengthOfPath);
		System.out.println(res);
		if(!file.exists()){
			file.mkdir();
			System.out.println("Folder "+ file.getName()+" created at : "+path);
		}else {
			System.out.println("Folder already exists");
		}
	}

	public Date GetSytemDateAndTime(){
		Date date=new Date();
		return date;
	}
}