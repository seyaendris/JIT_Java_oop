
package studentinfo;
import java.util.*;
import java.io.*;

public class StudentInfo {

     public static int count = 0;
    public static int check = 0;
    
    
  static  void displayStart (Scanner input)
    {
         int choice;
         System.out.println();   
         System.out.println();        
         System.out.println();
         System.out.println("1.Login as adminstrator.");
         System.out.println("2.Login as student.");
         System.out.println("Enter your choice : ");
         choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
         
                 checkAdminPassword();
                 
                 operations();
                 break;
            }
            case 2:
            {
                studentView();
      
            }       
        }
    }  
  
  public static void searchStudent()
     {
    	 try{
             Scanner I = new Scanner(System.in); 
               System.out.println("Enter student's Id number");
               String id=I.nextLine();
               String line1;
               String line2;
               String line3;
               boolean status=false;
               try (BufferedReader myreader1 = new BufferedReader(new FileReader("UnderGraduateRegular.txt"));
		    BufferedReader myreader2 = new BufferedReader(new FileReader("PostGraduate.txt"));
		    BufferedReader myreader3 = new BufferedReader(new FileReader("UnderGraduateExtension.txt"))) {
		    while((line1 = myreader1.readLine())!=null) {
	            String[] mystudentData1=line1.split(",");
		    if(mystudentData1[2].equals(id)) {
			System.out.println();System.out.println();
		        System.out.println("The ID you searched is found in Undergraduate regular!");
		        System.out.println("************************************************");
		        System.out.println("Name: "+mystudentData1[3]);
			System.out.println("sex: "+mystudentData1[4]);
		        System.out.println("Age: "+mystudentData1[5]);
			System.out.println("Phone Number: "+mystudentData1[6]);
		        System.out.println("Address: "+mystudentData1[7]);
		        System.out.println("Academic year: "+mystudentData1[8]);
	                System.out.println("Semester: "+mystudentData1[9]);
		        System.out.println("Dormitory: "+mystudentData1[10]);
		        System.out.println("Cafe: "+mystudentData1[11]);
		        System.out.println("************************************************");
		        System.out.println();
		        status=true;
			operations();
					          }}
					               
		    while((line2 = myreader2.readLine())!=null) {
		    String[] mystudentData2=line2.split(",");
		    if(mystudentData2[2].equals(id)) {
		        System.out.println();System.out.println();
			System.out.println("The ID you searched is found in post graduate!!");
			System.out.println("************************************************");
			System.out.println("Name: "+mystudentData2[3]);
		        System.out.println("sex: "+mystudentData2[4]);
		        System.out.println("Age: "+mystudentData2[5]);
			System.out.println("Phone Number: "+mystudentData2[6]);
		        System.out.println("Address: "+mystudentData2[7]);
		        System.out.println("Previous GPA: "+mystudentData2[8]);
			System.out.println("Current job: "+mystudentData2[9]);
	                System.out.println("Previous university: "+mystudentData2[10]);
			System.out.println("educational background: "+mystudentData2[11]);
			System.out.println("************************************************");
			System.out.println();
			status=true;
		        operations();					      
					    }}
		    while((line3 = myreader3.readLine())!=null) {
	            String[] mystudentData3=line3.split(",");
		    if(mystudentData3[2].equals(id)) {
		        System.out.println();System.out.println();
			System.out.println("The ID you searched is found in undergraduate extension!");
			System.out.println("************************************************");
		        System.out.println("Name: "+mystudentData3[3]);
		        System.out.println("sex: "+mystudentData3[4]);
			System.out.println("Age: "+mystudentData3[5]);
		        System.out.println("Phone Number: "+mystudentData3[6]);
		        System.out.println("Address: "+mystudentData3[7]);
			System.out.println("Type: "+mystudentData3[8]);
		        System.out.println("Year: "+mystudentData3[9]);
			System.out.println("Term: "+mystudentData3[10]);
			System.out.println("************************************************");
			System.out.println();
			status=true;
			operations();				      
					    } }
				                   }
               if(status==false) {
            	   System.out.println("There is no student by this ID number.");
            	   operations();
            	       }
               } catch(IOException e)
                 {
               System.out.println("error!");
                 }	 
     }
  
  public static void studentView()
    {
          Scanner ID = new Scanner(System.in);
          System.out.println("Enter your Username");
            String username=ID.nextLine();
          System.out.println("Enter your Password");
            String password=ID.nextLine();
          String[] Filenames= {"UnderGraduateRegular.txt","UnderGraduateExtension.txt","PostGraduate.txt"};
          FileInputStream[] fis=new FileInputStream[Filenames.length];
          for(int i=0; i<Filenames.length; i++) {
           try {
           fis[i]=new FileInputStream(Filenames[i]);
               } catch (FileNotFoundException e) {
               System.out.println("error!");
            }
           }
          BufferedReader[] brs=new BufferedReader[Filenames.length];
          for(int i=0; i<Filenames.length; i++) {
           try {
            brs[i]=new BufferedReader(new InputStreamReader(fis[i]));
             }catch (Exception e) {
               System.out.println("error!");
                }
                                  }
          String line;
          for(int i=0; i<Filenames.length; i++) {
          try{
              while((line = brs[i].readLine())!=null) {
              String[] studentData=line.split(",");
              if(studentData[0].equals(username)&&studentData[1].equals(password)) {
              System.out.println("1: View personal information");
              System.out.println("0: Exit"); 
              System.out.print("Your Input: ");
              int ch=ID.nextInt();
              switch(ch) {
              case 1: 
                 try{
                  Scanner I = new Scanner(System.in); 
                  System.out.println("Enter your Id number");
                  String id=I.nextLine();
                  String line1;
                  String line2;
                  String line3;
                  boolean status=false;
                  try (BufferedReader myreader1 = new BufferedReader(new FileReader("UnderGraduateRegular.txt"));
		       BufferedReader myreader2 = new BufferedReader(new FileReader("PostGraduate.txt"));
	               BufferedReader myreader3 = new BufferedReader(new FileReader("UnderGraduateExtension.txt"))) {
		         while((line1 = myreader1.readLine())!=null) {
                         String[] mystudentData1=line1.split(",");
		         if(mystudentData1[2].equals(id)) {
			    System.out.println();System.out.println();
			    System.out.println("your information is found in Undergraduate regular!");
		            System.out.println("************************************************");
			    System.out.println("Name: "+mystudentData1[3]);
		            System.out.println("sex: "+mystudentData1[4]);
			    System.out.println("Age: "+mystudentData1[5]);
			    System.out.println("Phone Number: "+mystudentData1[6]);
		            System.out.println("Address: "+mystudentData1[7]);
			    System.out.println("Academic year: "+mystudentData1[8]);
			    System.out.println("Semester: "+mystudentData1[9]);
			    System.out.println("Dormitory: "+mystudentData1[10]);
			    System.out.println("Cafe: "+mystudentData1[11]);
			    System.out.println("************************************************");
			    System.out.println();
			    status=true;
			    displayStart(ID);
					    }}
		          while((line2 = myreader2.readLine())!=null) {
			  String[] mystudentData2=line2.split(",");
			  if(mystudentData2[2].equals(id)) {
			    System.out.println();System.out.println();
			    System.out.println("your information is found in post graduate!!");
			    System.out.println("************************************************");
			    System.out.println("Name: "+mystudentData2[3]);
			    System.out.println("sex: "+mystudentData2[4]);
			    System.out.println("Age: "+mystudentData2[5]);
			    System.out.println("Phone Number: "+mystudentData2[6]);
			    System.out.println("Address: "+mystudentData2[7]);
			    System.out.println("Previous GPA: "+mystudentData2[8]);
			    System.out.println("Current job: "+mystudentData2[9]);
			    System.out.println("Previous university: "+mystudentData2[10]);
			    System.out.println("educational background: "+mystudentData2[11]);
			    System.out.println("************************************************");
			    System.out.println();
			    status=true;
			    displayStart(ID);
                             }}
	                  while((line3 = myreader3.readLine())!=null) {
			  String[] mystudentData3=line3.split(",");
			  if(mystudentData3[2].equals(id)) {
			    System.out.println();System.out.println();
			    System.out.println("your information is found in undergraduate extension!");
		            System.out.println("************************************************");
			    System.out.println("Name: "+mystudentData3[3]);
			    System.out.println("sex: "+mystudentData3[4]);
			    System.out.println("Age: "+mystudentData3[5]);
			    System.out.println("Phone Number: "+mystudentData3[6]);
		            System.out.println("Address: "+mystudentData3[7]);
			    System.out.println("Type: "+mystudentData3[8]);
			    System.out.println("Year: "+mystudentData3[9]);
			    System.out.println("Term: "+mystudentData3[10]);
			    System.out.println("************************************************");
			    System.out.println();
			    status=true;
			    displayStart(ID);
					          } }
				}
                  if(status==false) 
                	  {
                	  System.out.println("Wrong ID!");
                	  studentView();
                	  }
                	  }catch(IOException e)
                                  {
                                  System.out.println("error!");
                                   }       
                                                           
              case 0:
                 {
                  System.exit(0);
                          
                 }
                   }}
                  else {
            	       System.out.println("Wrong username or password!");
            	       studentView();
                       }
          }}catch(IOException e)
             {
             System.out.println("error!");
             }} 
    }
  
  public static void welcome() {
           System.out.println();
           System.out.println();
           System.out.println("\t\t******************************************");      
           System.out.println("\t\t*****    STUDENT INFORMATION SYSTEM  *****");
           System.out.println("\t\t******************************************");      
                                }
  static void checkAdminPassword() {
           Scanner input=new Scanner(System.in);
           String Password = null;
           int len;
           String Newpassword;
           String insertedPassword = null;
           FileWriter myWriter;
           String data;
           try {
             File myObj = new File("Password.txt");
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                Password = data;
                    }
             myReader.close();
             } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
             }
            if (Password == null) {
            System.out.println("There is no saved password!");
            System.out.println("please Set New Password : ");
            try {
                do {
                    System.out.println("Enter at least 6 characters!");
                    myWriter = new FileWriter("Password.txt");
                    Newpassword = input.nextLine();
                    len = Newpassword.length();
                    } while (len < 6);
                    myWriter.write(Newpassword);
                    myWriter.close();
                    System.out.println("You have Successfully set your Password.");
                    System.out.println("---------------------------------------------------");
                   } catch (IOException e) {
                    System.out.println("An error occurred during writing password.");
                   }
                } else {
                int max_try = 0;
                do {
                if (Password != null) {
                    if (max_try == 0) {
                        System.out.println("Please enter your password to continue: ");
                    } else {
                        System.out.println("Your password is incorrect,Please try again....");
                    }
                    insertedPassword = input.nextLine();
                    if (insertedPassword == null ? Password == null : insertedPassword.equals(Password)) {
                        break;
                    }
                    max_try++;
                    }
                if (max_try == 3) {
                    System.out.println("You have tried 3 times, Access Denied!");
                    System.exit(0);
                                  }
                   } while (Password != insertedPassword);  } 
    }
  
  public static void operations() {
           int uinput;
           Scanner input =new Scanner(System.in);      
           try {
            do {
                 alternatives();
                 int inserted = input.nextInt();
                 uinput = inserted;
                 if (uinput >= 0 && uinput <= 3) {
                    typeOfStudent(inserted);
                    inserted = input.nextInt();
                    input.nextLine();
                    actions(inserted, input);
                    inserted = input.nextInt();                  
                    createArray(inserted, input);
                 } else {
                    System.out.println("YOUR INPUT IS OUT OF RANGE");
                    System.out.println("Please Try again and choose from the given alterantives");
                         }
                } while (uinput != 0);
                } catch (Exception e) {
                  System.out.println(e);
                  check++;
                    }
                 if (check > 0) {
                 debbugger();
                 }
                 }

 public static void debbugger() {
        Scanner sc = new Scanner(System.in);
        operations();
        check = 0;
                                 }

 public static void alternatives() throws InterruptedException, IOException {     
        System.out.println("\tChoose Your Operation");
        System.out.println("1. To Add a student");
        System.out.println("2. To Show students added before");
        System.out.println("3. To search for a specific student");
        System.out.println("0. To EXIT");
        System.out.print("Your Input: ");
        count = 0;      
          }
 public static void typeOfStudent(int number) {
        count += number;
        switch (number) {
            case 1:
                System.out.println("Choose The Type of Student You Want To Add: ");
                System.out.println("1. UnderGraduate");
                System.out.println("2. PostGraduate");
                System.out.print("Your Input: ");
                break;
            case 2:
                System.out.println("Choose The Type of Student You Want To Check: ");
                System.out.println("1. UnderGraduate");
                System.out.println("2. PostGraduate");
                System.out.println("3. All");
                System.out.print("Your Input: ");
                break;
            case 3:
            	searchStudent();
            	break;
            case 0:
                System.out.println("THANK YOU FOR VISITING");
                System.exit(0);
                break;
        }
    }

 public static void actions(int number, Scanner input) {
        if (count == 1) {
        switch (number) {
            case 1:
                System.out.println("How Many UnderGraduate Students You Want To Add To The System?");
                 count += 5;
                 break;
            case 2:
                 System.out.println("How Many PostGraduate Students You Want To Add To The System?");
                 count += 10;
                 break;
            default:
                 System.out.println("Invalid input, Please Try Again....");
                 break;
                         }
        }else if (count == 2) {
        switch (number) {
            case 1:
                 System.out.println("Choose The Type of Undergraduate Student : ");
                 System.out.println("1. Regular");
                 System.out.println("2. Extension");
                 int chstd = input.nextInt();
                 input.nextLine();
                 if (chstd == 1) {
                        System.out.println("UnderGraduate Regular Students : ");
                        showUGSR();
                 }else if (chstd == 2) {
                        System.out.println("UnderGraduate Extension Students : ");
                        showUGSEE();
                 }else {
                        System.out.println("your input is invalid");
                        }
                 operations();
                 break;
            case 2:
                 System.out.println("PostGraduate Students : ");
                 showPGS();
                 operations();
                 break;
            case 3:
                 System.out.println();
                 System.out.println("All Students : ");
                 showPGS();
                 showUGSR();
                 showUGSEE();
                 operations();
                 break;
            default:
                  System.out.println("Invalid input, Please Try Again....");
                  operations();
                  break;
            }
        } 
    }

 public static void createObject(Regular[] user, int index) {
        for (int i = 0; i < index; i++) {
            user[i] = new Regular();
          }
          }
 
 public static void createObject(Extension[] user, int index) {
        for (int i = 0; i < index; i++) {
            user[i] = new Extension();
          }
          }

 public static void createObject(PostGraduate[] stud, int index) {
        for (int i = 0; i < index; i++) {
            stud[i] = new PostGraduate();
        }
        }

 public static void createArray(int number, Scanner input) {
        if (count == 6) {
            System.out.println("Choose The Student Type: ");
            System.out.println("1. Regular");
            System.out.println("2. Extension");
            int chstd = input.nextInt();
            input.nextLine();
            if (chstd == 1) {
                Regular reg[] = new Regular[number];
                createObject(reg, number);
                getInput(reg, number, input);
            }else if (chstd == 2) {
                Extension ext[] = new Extension[number];
                createObject(ext, number);
                getInput(ext, number, input);
            }else {
                System.out.println("your input is invalid");

            }

        }else if (count == 11) {
            PostGraduate[] stud = new PostGraduate[number];
            createObject(stud, number);
            getInput(stud, number, input);
        }
    }

 public static void getInput(PostGraduate[] user, int index, Scanner input) {
        System.out.println("insert the student in the below format");
        for (int i = 0; i < index; i++) {
            System.out.print("Enter username : ");
            String username = input.nextLine();
            input.nextLine();
            System.out.print("Enter password : ");
            String password = input.nextLine();
            System.out.print("Enter Id number(6 digits) : ");
            int id = input.nextInt();
            String idString = Integer.toString(id);
            int digits = idString.length();
            while(digits!=6)
            {
            	System.out.print("please enter valid id number : ");
            	id = input.nextInt();
            	idString = Integer.toString(id);
            	digits = idString.length();
            }
            input.nextLine();
            
            System.out.print("Enter Name : ");
            String name = input.nextLine();
            String sex ;
            while(true)
            {
            	
                System.out.print("Enter sex(M/F) : ");
                sex = input.nextLine();
                 if(sex.equalsIgnoreCase("M"))
                 {
                	 sex="Male";
                	 break;
                 }
                 else if(sex.equalsIgnoreCase("F"))
                 {
                	 
                	 sex="Female"; 
                	 break;
                 }
                 else
                 {
                	 System.out.println("Invalid input,try again.");
                	 System.out.print("Enter sex(M/F) : ");
                	 sex = input.nextLine();
                 }
            }
            
            System.out.print("Enter Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter Phone No. : ");
            String phone=input.nextLine();
            
            while(phone.length() != 10){
                System.out.println("Phone number must be 10 digits. Please enter valid phone number.");
                System.out.print("Enter Phone No. : ");
                phone = input.nextLine();
            }
            System.out.print("Enter Address : ");
            String address = input.nextLine();
            System.out.print("Enter Previous GPA : ");
            double gpa = input.nextDouble();
            input.nextLine();
            System.out.print("Enter Current Job : ");
            String job = input.nextLine();
            System.out.print("Enter Previous university: ");
            String pCampus = input.nextLine();

            System.out.print("Enter Educational Background : ");
            String eduBack = input.nextLine();
            user[i].SetInformation(username,password,id, name, sex, age, phone, address, gpa, job, pCampus, eduBack);
            if (i < index - 1) {
                System.out.println("insert the next Student ********************************\\");
            }
        }
    }

 public static void getInput(Regular[] user, int index, Scanner input) {
        System.out.println("insert the Student in the below format");
        for (int i = 0; i < index; i++) {
        	
      
            System.out.print("Enter username : ");
            String username = input.nextLine();
            System.out.print("Enter password : ");
            String password = input.nextLine();                 
            System.out.print("Enter Id number(6 digits) : ");
            int id = input.nextInt();
            String idString = Integer.toString(id);
            int digits = idString.length();
            while(digits!=6)
            {
            	System.out.print("please enter valid id number : ");
            	id = input.nextInt();
            	idString = Integer.toString(id);
            	digits = idString.length();
            }
            input.nextLine();
            
            
            System.out.print("Enter Full name : ");
            String name = input.nextLine();
            
            String sex ;
            while(true)
            {
            	
                System.out.print("Enter sex(M/F) : ");
                sex = input.nextLine();
                 if(sex.equalsIgnoreCase("M"))
                 {
                	 sex="Male";
                	 break;
                 }
                 else if(sex.equalsIgnoreCase("F"))
                 {
                	 
                	 sex="Female"; 
                	 break;
                 }
                 else
                 {
                	 System.out.println("Invalid input,try again.");
                	 System.out.print("Enter sex(M/F) : ");
                	 sex = input.nextLine();
                 }
            }
            
            	
            System.out.print("Enter Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter Academic Year : ");
            int year = input.nextInt();
            input.nextLine();
            System.out.print("Enter Semister : ");
            int semister = input.nextInt();
            input.nextLine();
            System.out.print("Enter Dorm No.: ");
            int dorm = input.nextInt();
            input.nextLine();
            System.out.print("Enter Assigned Cafeteria: ");
            String cafe = input.nextLine();
            System.out.print("Enter Phone No. : ");
            String phone=input.nextLine();
            
            while(phone.length() != 10){
                System.out.println("Phone number must be 10 digits. Please enter valid phone number.");
                System.out.print("Enter Phone No. : ");
                phone = input.nextLine();
            }
            System.out.print("Enter Address : ");
            String address = input.nextLine();
            user[i].SetInformation(username ,password,id, name, sex, age, phone, address, year, semister, dorm, cafe);
            if (i < index - 1) {
                System.out.println("Insert the next Student********************************\\");
            }
        }
    }

 public static void getInput(Extension[] user, int index, Scanner input) {
        System.out.println("insert the Student in the below format");
        for (int i = 0; i < index; i++) {           
            System.out.print("Enter username : ");
            String username = input.nextLine();        
            System.out.print("Enter password : ");
            String password = input.nextLine();
            System.out.print("Enter Id number(6 digits) : ");
            int id = input.nextInt();
            String idString = Integer.toString(id);
            int digits = idString.length();
            while(digits!=6)
            {
            	System.out.print("please enter valid id number : ");
            	id = input.nextInt();
            	idString = Integer.toString(id);
            	digits = idString.length();
            }
            input.nextLine();
            
            System.out.print("Enter Name : ");
            String name = input.nextLine();        
            String sex ;
            while(true)
            {
            	
            	System.out.print("Enter sex(M/F) : ");
                sex = input.nextLine();
            
                 if(sex.equalsIgnoreCase("M"))
                    {
                	 sex="Male";
                	 break;
                	 
                     }
                 else if(sex.equalsIgnoreCase("F"))
                 {
                	 
                	 sex="Female"; 
                	 break;
                	 
                 }
                 else
                 {
                	 System.out.println("Invalid input,try again."); 
                    
                 }
                 input.nextLine(); 
            }          
            System.out.print("Enter Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter Academic Year : ");
            int year = input.nextInt();
            input.nextLine();
            System.out.print("Enter Extension Type : ");
            String type = input.nextLine();
            System.out.print("Enter Term : ");
            int term = input.nextInt();
            input.nextLine();
            System.out.print("Enter Phone No. : ");
            String phone=input.nextLine();
            
            while(phone.length() != 10){
                System.out.println("Phone number must be 10 digits. Please enter valid phone number.");
                System.out.print("Enter Phone No. : ");
                phone = input.nextLine();
            }
            System.out.print("Enter Address : ");
            String address = input.nextLine();          
            user[i].SetInformation(username,password,id, name, sex, age, phone, address,  year, type, term);
            if (i < index - 1) {
                System.out.println("insert the next Student********************************\\");
            }
        }
    }

 public static void showUGSR() {
        try {
            String line1;       
            BufferedReader myreader=new BufferedReader(new FileReader("UnderGraduateRegular.txt"));
            while((line1 = myreader.readLine())!=null) {
                      String[] mystudentData=line1.split(",");
                      System.out.println();
                      System.out.println("Under garduate regular students!");
                      System.out.println("-----------------------------------------------------------"); 
                      System.out.println("Name: "+mystudentData[3]);
                      System.out.println("sex: "+mystudentData[4]);
                      System.out.println("Age: "+mystudentData[5]);
                      System.out.println("Phone Number: "+mystudentData[6]);
                      System.out.println("Address: "+mystudentData[7]);
                      System.out.println("Academic year: "+mystudentData[8]);
                      System.out.println("Semester: "+mystudentData[9]);
                      System.out.println("Dormitory: "+mystudentData[10]);
                      System.out.println("Cafe: "+mystudentData[11]);
                      System.out.println("-----------------------------------------------------------"); 
                      System.out.println();
             }   
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        catch(IOException f)
        {
          System.out.println("An error occurred.");  
        }
    }

 public static void showUGSEE() {
        try {
            String line1;
            BufferedReader myreader=new BufferedReader(new FileReader("UnderGraduateExtension.txt"));
            while((line1 = myreader.readLine())!=null) {
                      String[] mystudentData=line1.split(",");
                      System.out.println();
                      System.out.println("Under garduate extension students!");
                      System.out.println("-----------------------------------------------------------"); 
                      System.out.println("Name: "+mystudentData[3]);
                      System.out.println("sex: "+mystudentData[4]);
                      System.out.println("Age: "+mystudentData[5]);
                      System.out.println("Phone Number: "+mystudentData[6]);
                      System.out.println("Address: "+mystudentData[7]);
                      System.out.println("Type: "+mystudentData[8]);
                      System.out.println("Year: "+mystudentData[9]);
                      System.out.println("Term: "+mystudentData[10]);
                      System.out.println("-----------------------------------------------------------"); 
                      System.out.println();
                 }              
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        catch(IOException f)
        {
          System.out.println("An error occurred.");  
        }
    }

 public static void showPGS() {
       try {
            String line1;
             BufferedReader myreader=new BufferedReader(new FileReader("PostGraduate.txt"));
             while((line1 = myreader.readLine())!=null) {
                    String[] mystudentData=line1.split(",");
                      System.out.println();
                      System.out.println("Post graduate students!");
                      System.out.println("-----------------------------------------------------------");  
                      System.out.println("Name: "+mystudentData[3]);
                      System.out.println("sex: "+mystudentData[4]);
                      System.out.println("Age: "+mystudentData[5]);
                      System.out.println("Phone Number: "+mystudentData[6]);
                      System.out.println("Address: "+mystudentData[7]);
                      System.out.println("Previous GPA : "+mystudentData[8]);
                      System.out.println("Current job: "+mystudentData[9]);
                      System.out.println("previous university: "+mystudentData[10]);
                      System.out.println("Educational background: "+mystudentData[11]);
                      System.out.println("-----------------------------------------------------------");  
                      System.out.println();

             }   
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        catch(IOException f)
        {
          System.out.println("An error occurred.");  
        }
        } 
 public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        welcome();
        displayStart(input);    
    } 
    }


class UnderGraduate extends Student {
    private int Year;
    public void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address, int Year) {
                super.SetInformation(username,password,id, full_name, sex, age, phone_number, address);
               this.Year = Year;
                }
    
    public void getInfo() {
        super.getInfo();
        System.out.println("Student Academic Year: " + Year);
    }
    }

class Regular extends UnderGraduate {
    private int semister;
    private int dormitory;
    private String cafe;
    public void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address, int Year, int semister, int dormitory, String cafe) {
        super.SetInformation(username,password,id, full_name, sex, age, phone_number, address,  Year);
        this.semister = semister;
        this.dormitory = dormitory;
        this.cafe = cafe;
        try {
            FileWriter myWriter = new FileWriter("UnderGraduateRegular.txt",true);
            myWriter.write(username + ",");
            myWriter.write(password + ",");
            myWriter.write(id + ",");
            myWriter.write(full_name + ",");
            myWriter.write(sex + ",");
            myWriter.write(age + ",");
            myWriter.write(phone_number + ",");
            myWriter.write(address + ",");
            myWriter.write(Year + ",");
            myWriter.write(semister + ",");
            myWriter.write(dormitory + ",");
            myWriter.write(cafe + "\n");
            myWriter.close();    
            System.out.println("Student Info Uploaded Successfully......");
            System.out.println("---------------------------------------------------------\n");
            } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        }
    public void getInfo() {
        super.getInfo();
        System.out.println(" Semister: " + semister);
        System.out.println(" Dormitory: " + dormitory);
        System.out.println(" Cafe: " + cafe);
    }
    }
class Extension extends UnderGraduate {

    private String Type;
    private int Term;
    public void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address, int Year, String Type, int Term) {
        super.SetInformation(username,password,id, full_name, sex, age, phone_number, address, Year);
        this.Type = Type;
        this.Term = Term;
        try {
            FileWriter myWriter = new FileWriter("UnderGraduateExtension.txt", true);
            myWriter.write(username +",");
            myWriter.write( password + ",");
            myWriter.write(id + ",");
            myWriter.write(full_name + ",");
            myWriter.write(sex + ",");
            myWriter.write(age + ",");
            myWriter.write(phone_number + ",");
            myWriter.write(address + ",");
            myWriter.write(Type + ",");
            myWriter.write(Year + ",");
            myWriter.write(Term + "\n");
            myWriter.close();
            System.out.println("Student Info Uploaded Successfully......");
            System.out.println("---------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void getInfo() {
        super.getInfo();
        System.out.println(" Type: " + Type);
        System.out.println(" Term: " + Term);
    }
}

class PostGraduate extends Student {
    private double previousgpa;
    private String job;
    private String previouscampus;
    private String educbackground;
    public void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address,  double previousgpa, String job, String previouscampus, String educbackground) {
        super.SetInformation(username,password,id, full_name, sex, age, phone_number, address);
        this.previousgpa = previousgpa;
        this.job = job;
        this.previouscampus = previouscampus;
        this.educbackground = educbackground;
        try {
            FileWriter myWriter = new FileWriter("PostGraduate.txt", true);
            myWriter.write(username +",");
            myWriter.write(password +",");
            myWriter.write(id + ",");
            myWriter.write(full_name + ",");
            myWriter.write(sex + ",");
            myWriter.write(age + ",");
            myWriter.write(phone_number + ",");
            myWriter.write(address + ",");
            myWriter.write(previousgpa + ",");
            myWriter.write(job + ",");
            myWriter.write(previouscampus + ",");
            myWriter.write(educbackground + "\n");
            myWriter.close();
            System.out.println("Student Info Uploaded Successfully......");
            System.out.println("---------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        }
    
    public void getInfo() {
        super.getInfo();
        System.out.println(" Previous GPA: " + previousgpa);
        System.out.println(" Occupation: " + job);
        System.out.println(" Previous Campus: " + previouscampus);
        System.out.println(" Educational Background: " + educbackground);
    }
    }
abstract class Student extends Common {
    private int id;
    private String full_name;
    private String sex;
    private int age;
    private String phone_number;
    private String address;
    private String username;
    private String password;
    public void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address) {
        this.id = id;
        this.full_name = full_name;
        this.sex = sex;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.username=username;
        this.password=password;
        }

    public void getInfo() {
        System.out.println(" username: " + username);
        System.out.println(" password: " + password);
        System.out.println(" Id: " + id);
        System.out.println(" Full name: " + full_name);
        System.out.println(" sex: " + sex);
        System.out.println(" Age: " + age);
        System.out.println(" Phone Number: " + phone_number);
        System.out.println(" Address: " + address);
      }
      }
abstract class Common {
    public abstract void SetInformation(String username,String password,int id, String full_name, String sex, int age, String phone_number, String address);
    public abstract void getInfo();  
                       }





/* Group Members                             ID   
 * 1.ERMIAS WAKGARI------------------------RU2380/13
 * 2.SEID ENDRIS---------------------------RU1644/13
 * 3.FIRDOWS BEDRU-------------------------RU0138/13
 * 4.EPHREM ENEYEW-------------------------RU1348/13
 * 5.NANATI MENGSTU------------------------RU1513/12 */

