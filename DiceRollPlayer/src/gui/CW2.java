package gui;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

public class CW2{

static int i, Str, Dex, Con, Int, Wis, Cha, level=0;

public static int sum(List<Integer> list)
{
    int sum= 0; 
    for (int number : list)
        sum = sum + number;
    return sum;
}

	public static void main(String[] args) throws IOException {
    	    String[]stat= {"Str", "Dex", "Con", "Int", "Wis", "Cha"};
    	    double Hitpoint;
            Scanner sc = new Scanner(System.in);


    	    System.out.println("You have to enter a LEVEL:");
    	    level = sc.nextInt();


   
   AttributeSelect();
}
	
   static void AttributeSelect() throws IOException{
	   
	   
		File statText = new File("D:/statsTest.txt"); // Windows
		//File statText = new File("D:/statsTest.txt"); MAC OS
        FileOutputStream is = new FileOutputStream(statText);
        OutputStreamWriter osw = new OutputStreamWriter(is);    
        Writer w = new BufferedWriter(osw);
        Writer writer = null;
	   
	    System.out.println("You have got 4 choices:");
	    
        Scanner in = new Scanner(System.in);

	    System.out.println("1\t Enter the stats Manually");
	    System.out.println("2\t Roll 4d6 and drop the lowest one");
	    System.out.println("3\t Roll 4d6 dice and drop the lowest value and if the value is 16 or higher add 1d6 to it");
	    System.out.println("4\t Roll method IV..");
	    System.out.println("5\t Exit");
	    
System.out.println("Select a choice you like, to get the attributes.");

int choice=in.nextInt();
	    
	   String[]stat= {"Str", "Dex", "Con", "Int", "Wis", "Cha"};
	    double Hitpoint;
       Scanner sc = new Scanner(System.in);

   switch (choice) {
   case 1: 
	   
	   System.out.println("Enter the stats Manually"); 
	   
	   {
		   
		
		   System.out.println("Str:-");
			Str = in.nextInt();
			System.out.println("Dex:-");
			Dex = in.nextInt();
			System.out.println("Con:-");
			Con = in.nextInt();
			System.out.println("Int:-");
			Int = in.nextInt();
			System.out.println("Wis:-");
			Wis = in.nextInt();
			System.out.println("Cha:-");
	
	   

           //bonus for Str
           int Bonus1 = 0;
			//Str = 0;
			if (Str == 10 || Str == 11) {
				Bonus1 = 0;

				System.out.println("Str: [" + Str + "]" + "[" + Bonus1 + "]");
			} else if (Str < 10) {

				for (int i = 10; i >= Str; i--) {
					if (i % 2 == 1) {
						Bonus1++;
					}
				}
				System.out.println("Str: [" + Str + "]" + "[" + "-" + Bonus1 + "]");
			} else {
				for (int i = Str; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus1++;
					}
				}
				System.out.println("Str: [" + Str + "]" + "[" + "+" + Bonus1 + "]");
			}
			
			
			//bonus for Dex
			
			int Bonus2 = 0;
			//Dex= 0;
			if (Str == 10 || Str == 11) {
				Bonus2 = 0;

				System.out.println("Dex: [" + Dex + "]" + "[" + Bonus2 + "]");
			} else if (Dex < 10) {

				for (int i = 10; i >= Dex; i--) {
					if (i % 2 == 1) {
						Bonus1++;
					}
				}
				System.out.println("Dex: [" + Dex + "]" + "[" + "-" + Bonus2 + "]");
			} else {
				for (int i = Dex; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus2++;
					}
				}
				System.out.println("Dex: [" + Dex + "]" + "[" + "+" + Bonus2 + "]");
			}
			
			
			//Bonus for Con
			int Bonus3 = 0;
			//Con = 0;
			if (Con == 10 || Con == 11) {
				Bonus1 = 0;

				System.out.println("Con: [" + Con + "]" + "[" + Bonus3 + "]");
			} else if (Con < 10) {

				for (int i = 10; i >= Con; i--) {
					if (i % 2 == 1) {
						Bonus3++;
					}
				}
				System.out.println("Con: [" + Con + "]" + "[" + "-" + Bonus3 + "]");
			} else {
				for (int i = Con; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus3++;
					}
				}
				System.out.println("Con: [" + Con + "]" + "[" + "+" + Bonus3+ "]");
			}
			

			//bonus for Int 
			int Bonus4 = 0;
			//Str = 0;
			if (Int== 10 || Int == 11) {
				Bonus4 = 0;

				System.out.println("Int: [" + Int + "]" + "[" + Bonus4 + "]");
			} else if (Int < 10) {

				for (int i = 10; i >= Int; i--) {
					if (i % 2 == 1) {
						Bonus4++;
					}
				}
				System.out.println("Int: [" + Int + "]" + "[" + "-" + Bonus4 + "]");
			} else {
				for (int i = Int; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus4++;
					}
				}
				System.out.println("Int: [" + Int+ "]" + "[" + "+" + Bonus4 + "]");
			}
			
			
			//bonus for Wis
			int Bonus5 = 0;
			//Wis= 0;
			if (Wis == 10 || Wis== 11) {
				Bonus1 = 0;

				System.out.println("Wis: [" + Wis + "]" + "[" + Bonus5 + "]");
			} else if (Wis < 10) {

				for (int i = 10; i >= Wis; i--) {
					if (i % 2 == 1) {
						Bonus5++;
					}
				}
				System.out.println("Wis [" + Wis + "]" + "[" + "-" + Bonus5 + "]");
			} else {
				for (int i = Wis; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus1++;
					}
				}
				System.out.println("Wis: [" + Wis+ "]" + "[" + "+" + Bonus5+ "]");
			}
			
			
			
			//bonus for Cha
			int Bonus6 = 0;
			//Cha = 0;
			if (Cha == 10 || Cha == 11) {
				Bonus6 = 0;

				System.out.println("Cha: [" + Cha + "]" + "[" + Bonus6 + "]");
			} else if (Cha < 10) {

				for (int i = 10; i >= Cha; i--) {
					if (i % 2 == 1) {
						Bonus6++;
					}
				}
				System.out.println("Cha: [" + Cha+ "]" + "[" + "-" + Bonus6 + "]");
			} else {
				for (int i = Cha; i > 10; i--) {
					if (i % 2 == 0) {
						Bonus6++;
					}
				}
				
			System.out.println("Cha: [" + Cha + "]" + "[" + "+" + Bonus6 + "]");
			}
			
			System.out.println("  ");
		
			Hitpoint = level * (Math.random() * 1000 % 6 + 1);
			System.out.println("HitPoint" + "[" + Hitpoint + "]");
			

			try {

	            
	            w.write("Level "+new Integer(level).toString() +"\n");
	            w.write("Str " +new Integer(Str).toString() +"\n");
	            w.write("Dex " +new Integer(Dex).toString() +"\n");
	            w.write("Con " +new Integer(Con).toString() +"\n");
	            w.write("Cha " +new Integer(Cha).toString() +"\n");
	            w.write("Int " +new Integer(Int).toString() +"\n");
	            w.write("HitPoint " +new Double(Hitpoint).toString() +"\n");
	          w.close();
	            
			} catch (IOException ex) {
			    // Report
			} finally {
			   try {writer.close();} catch (Exception ex) {/*ignore*/}
			}
			
	   
	   System.out.println("Do You want to continue? (y/n)");
	   Scanner in2 = new Scanner(System.in);
	   String cont =in2.next();
	   if(cont.equals("n")){
		 AttributeSelect();
	    }
	   else
	   {
		   System.out.println("Select Skills :  \n");
           
		   LinkListTest lw = new LinkListTest();
		   lw.LinkedList();
		   
		   
		   System.out.println("\n Select Your Skill :\n");
		   Scanner in3 = new Scanner(System.in);
		   String cont3 =in3.next();
		   
		   switch(cont3){
		   case "Thievery":
			   Skill sk = new Skill("Thievery", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 9, 3);
			   
			   
			   sk.printSkill();
			
			
			   break;
		   case "Survival":
			   Skill sk2 = new Skill("Survival", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 5, 4);
			   
			   
			   sk2.printSkill();
			  
			   break;
			   
		   case "Athletics":
			   Skill sk3 = new Skill("Athletics", "Strength", "Strength measures bodily power, athletic training, and the extent to which you can exert raw physical force.", 3, 1);
			   
			   
			   sk3.printSkill();
			   
			   break;
			   
		   case "Acrobatics":
			   Skill sk4 = new Skill("Acrobatics", "Dexterity", "Dexterity measures agility, reflexes, and balance.", 6, 2);

			   sk4.printSkill();
			 
			   break;
		   
		   }
	
		   File file =
				      new File("D:/statsTest.txt");
				    Scanner sc4 = new Scanner(file);
				 
				    while (sc4.hasNextLine())
				      System.out.println(sc4.nextLine());
		   
		   System.out.println("\nBase Attack Bonus : " + level);
		   System.out.println("Combat :" + level + Bonus1);
		   System.out.println("Damage :" + Bonus1);
           
		   
	   }
			
			
			
			
	   }
break;
   
   case 2: System.out.println("Roll 4d6 and drop the lowest one");{
	   
	    DiceRoller roller = new DiceRoller();
		List<Integer> dicerollsets = roller.roll4d6DropLowest();
		int total = sum(dicerollsets);
	   
		DiceRoller roller2 = new DiceRoller();
		List<Integer> dicerollset2 = roller2.roll4d6DropLowest();
		int total2 = sum(dicerollset2);
		
		DiceRoller roller3 = new DiceRoller();
		List<Integer> dicerollset3 = roller3.roll4d6DropLowest();
		int total3 = sum(dicerollset3);
		
		DiceRoller roller4 = new DiceRoller();
		List<Integer> dicerollset4 = roller3.roll4d6DropLowest();
		int total4 = sum(dicerollset4);
		
		DiceRoller roller5 = new DiceRoller();
		List<Integer> dicerollset5 = roller5.roll4d6DropLowest();
		int total5 = sum(dicerollset5);
		
		DiceRoller roller6 = new DiceRoller();
		List<Integer> dicerollset6 = roller6.roll4d6DropLowest();
		int total6 = sum(dicerollset6);
		
		    
			Str = total;
			System.out.println("Str:-" +total);
			
			Dex = total2;
			System.out.println("Dex:-"+total2);
			
			Con = total3;
			System.out.println("Con:-"+total3);
			
			Int = total4;
			System.out.println("Int:-"+total4);
			
			Wis = total5;
			System.out.println("Wis:-"+total5);
			
	        Cha = total6;
	        System.out.println("Cha:-"+total6);
	        

	           //bonus for Str
	           int Bonus1 = 0;
				//Str = 0;
				if (Str == 10 || Str == 11) {
					Bonus1 = 0;

					System.out.println("Str: [" + Str + "]" + "[" + Bonus1 + "]");
				} else if (Str < 10) {

					for (int i = 10; i >= Str; i--) {
						if (i % 2 == 1) {
							Bonus1++;
						}
					}
					System.out.println("Str: [" + Str + "]" + "[" + "-" + Bonus1 + "]");
				} else {
					for (int i = Str; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus1++;
						}
					}
					System.out.println("Str: [" + Str + "]" + "[" + "+" + Bonus1 + "]");
				}
				
				
				//bonus for Dex
				
				int Bonus2 = 0;
				//Dex= 0;
				if (Str == 10 || Str == 11) {
					Bonus2 = 0;

					System.out.println("Dex: [" + Dex + "]" + "[" + Bonus2 + "]");
				} else if (Dex < 10) {

					for (int i = 10; i >= Dex; i--) {
						if (i % 2 == 1) {
							Bonus1++;
						}
					}
					System.out.println("Dex: [" + Dex + "]" + "[" + "-" + Bonus2 + "]");
				} else {
					for (int i = Dex; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus2++;
						}
					}
					System.out.println("Dex: [" + Dex + "]" + "[" + "+" + Bonus2 + "]");
				}
				
				
				//Bonus for Con
				int Bonus3 = 0;
				//Con = 0;
				if (Con == 10 || Con == 11) {
					Bonus1 = 0;

					System.out.println("Con: [" + Con + "]" + "[" + Bonus3 + "]");
				} else if (Con < 10) {

					for (int i = 10; i >= Con; i--) {
						if (i % 2 == 1) {
							Bonus3++;
						}
					}
					System.out.println("Con: [" + Con + "]" + "[" + "-" + Bonus3 + "]");
				} else {
					for (int i = Con; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus3++;
						}
					}
					System.out.println("Con: [" + Con + "]" + "[" + "+" + Bonus3+ "]");
				}
				

				//bonus for Int 
				int Bonus4 = 0;
				//Str = 0;
				if (Int== 10 || Int == 11) {
					Bonus4 = 0;

					System.out.println("Int: [" + Int + "]" + "[" + Bonus4 + "]");
				} else if (Int < 10) {

					for (int i = 10; i >= Int; i--) {
						if (i % 2 == 1) {
							Bonus4++;
						}
					}
					System.out.println("Int: [" + Int + "]" + "[" + "-" + Bonus4 + "]");
				} else {
					for (int i = Int; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus4++;
						}
					}
					System.out.println("Int: [" + Int+ "]" + "[" + "+" + Bonus4 + "]");
				}
				
				
				//bonus for Wis
				int Bonus5 = 0;
				//Wis= 0;
				if (Wis == 10 || Wis== 11) {
					Bonus1 = 0;

					System.out.println("Wis: [" + Wis + "]" + "[" + Bonus5 + "]");
				} else if (Wis < 10) {

					for (int i = 10; i >= Wis; i--) {
						if (i % 2 == 1) {
							Bonus5++;
						}
					}
					System.out.println("Wis [" + Wis + "]" + "[" + "-" + Bonus5 + "]");
				} else {
					for (int i = Wis; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus1++;
						}
					}
					System.out.println("Wis: [" + Wis+ "]" + "[" + "+" + Bonus5+ "]");
				}
				
				
				
				//bonus for Cha
				int Bonus6 = 0;
				//Cha = 0;
				if (Cha == 10 || Cha == 11) {
					Bonus6 = 0;

					System.out.println("Cha: [" + Cha + "]" + "[" + Bonus6 + "]");
				} else if (Cha < 10) {

					for (int i = 10; i >= Cha; i--) {
						if (i % 2 == 1) {
							Bonus6++;
						}
					}
					System.out.println("Cha: [" + Cha+ "]" + "[" + "-" + Bonus6 + "]");
				} else {
					for (int i = Cha; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus6++;
						}
					}
					
				System.out.println("Cha: [" + Cha + "]" + "[" + "+" + Bonus6 + "]");
				}
				
				System.out.println("  ");
	        
	        
	        
		
			Hitpoint = level * (Math.random() * 1000 % 6 + 1);
			System.out.println("Hitpoint" + "[" + Hitpoint + "]");
			

			try {

	            
	            w.write("Level "+new Integer(level).toString() +"\n");
	            w.write("Str " +new Integer(Str).toString() +"\n");
	            w.write("Dex " +new Integer(Dex).toString() +"\n");
	            w.write("Con " +new Integer(Con).toString() +"\n");
	            w.write("Cha " +new Integer(Cha).toString() +"\n");
	            w.write("Int " +new Integer(Int).toString() +"\n");
	            w.write("Hitpoint " +new Double(Hitpoint).toString() +"\n");
	          w.close();
	            
			} catch (IOException ex) {
			    // Report
			} finally {
			   try {writer.close();} catch (Exception ex) {/*ignore*/}
			}
			
	   
	   System.out.println("Do You want to continue? (y/n)");
	   Scanner in2 = new Scanner(System.in);
	   String cont =in2.next();
	   if(cont.equals("n")){
		 AttributeSelect();
	    }
	   else
	   {
		   System.out.println("Select Skills :  \n");
           
		   LinkListTest lw = new LinkListTest();
		   lw.LinkedList();
		   
		   
		   System.out.println("\n Select Your Skill :\n");
		   Scanner in3 = new Scanner(System.in);
		   String cont3 =in3.next();
		   
		   switch(cont3){
		   case "Thievery":
			   Skill sk = new Skill("Thievery", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 9, 3);
			   
			   
			   sk.printSkill();
			
			
			   break;
		   case "Survival":
			   Skill sk2 = new Skill("Survival", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 5, 4);
			   
			   
			   sk2.printSkill();
			  
			   break;
			   
		   case "Athletics":
			   Skill sk3 = new Skill("Athletics", "Strength", "Strength measures bodily power, athletic training, and the extent to which you can exert raw physical force.", 3, 1);
			   
			   
			   sk3.printSkill();
			   
			   break;
			   
		   case "Acrobatics":
			   Skill sk4 = new Skill("Acrobatics", "Dexterity", "Dexterity measures agility, reflexes, and balance.", 6, 2);

			   sk4.printSkill();
			 
			   break;
		   
		   }
	
		   File file =
				      new File("D:/statsTest.txt");
				    Scanner sc4 = new Scanner(file);
				 
				    while (sc4.hasNextLine())
				      System.out.println(sc4.nextLine());
		   
		   System.out.println("\nBase Attack Bonus : " + level);
		   System.out.println("Combat :" + level + Bonus1);
		   System.out.println("Damage :" + Bonus1);
           
		   
	   }
	   
	   
	   
   }
           break;
   case 3: System.out.println("Roll 4d6 dice and drop the lowest value and if the value is 16 or higher add 1d6 to it"); {
	   

	   
	   
	   DiceRoller roller = new DiceRoller();
		List<Integer> dicerollsets = roller.roll4d6DropLowest();
		int total = sum(dicerollsets);
		if(total > 16 || total == 16)
			total = total + roller.rollSingleDie();
	   
		DiceRoller roller2 = new DiceRoller();
		List<Integer> dicerollset2 = roller2.roll4d6DropLowest();
		int total2 = sum(dicerollset2);
		if(total2 > 16 || total2 == 16)
			total2 = total2 + roller2.rollSingleDie();
		
		DiceRoller roller3 = new DiceRoller();
		List<Integer> dicerollset3 = roller3.roll4d6DropLowest();
		int total3 = sum(dicerollset3);
		if(total3 > 16 || total3 == 16)
			total3 = total3 + roller3.rollSingleDie();
		
		DiceRoller roller4 = new DiceRoller();
		List<Integer> dicerollset4 = roller3.roll4d6DropLowest();
		int total4 = sum(dicerollset4);
		if(total4 > 16 || total4 == 16)
			total4 = total4 + roller4.rollSingleDie();
		
		DiceRoller roller5 = new DiceRoller();
		List<Integer> dicerollset5 = roller5.roll4d6DropLowest();
		int total5 = sum(dicerollset5);
		if(total5 > 16 || total5 == 16)
			total5 = total5 + roller5.rollSingleDie();
		
		DiceRoller roller6 = new DiceRoller();
		List<Integer> dicerollset6 = roller6.roll4d6DropLowest();
		int total6 = sum(dicerollset6);
		if(total6 > 16 || total6 == 16)
			total6 = total6 + roller6.rollSingleDie();
		
		    
			Str = total;
			System.out.println("Str:-" +total);
			
			Dex = total2;
			System.out.println("Dex:-"+total2);
			
			Con = total3;
			System.out.println("Con:-"+total3);
			
			Int = total4;
			System.out.println("Int:-"+total4);
			
			Wis = total5;
			System.out.println("Wis:-"+total5);
			
	        Cha = total6;
	        System.out.println("Cha:-"+total6);
	        

	           //bonus for Str
	           int Bonus1 = 0;
				//Str = 0;
				if (Str == 10 || Str == 11) {
					Bonus1 = 0;

					System.out.println("Str: [" + Str + "]" + "[" + Bonus1 + "]");
				} else if (Str < 10) {

					for (int i = 10; i >= Str; i--) {
						if (i % 2 == 1) {
							Bonus1++;
						}
					}
					System.out.println("Str: [" + Str + "]" + "[" + "-" + Bonus1 + "]");
				} else {
					for (int i = Str; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus1++;
						}
					}
					System.out.println("Str: [" + Str + "]" + "[" + "+" + Bonus1 + "]");
				}
				
				
				//bonus for Dex
				
				int Bonus2 = 0;
				//Dex= 0;
				if (Str == 10 || Str == 11) {
					Bonus2 = 0;

					System.out.println("Dex: [" + Dex + "]" + "[" + Bonus2 + "]");
				} else if (Dex < 10) {

					for (int i = 10; i >= Dex; i--) {
						if (i % 2 == 1) {
							Bonus1++;
						}
					}
					System.out.println("Dex: [" + Dex + "]" + "[" + "-" + Bonus2 + "]");
				} else {
					for (int i = Dex; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus2++;
						}
					}
					System.out.println("Dex: [" + Dex + "]" + "[" + "+" + Bonus2 + "]");
				}
				
				
				//Bonus for Con
				int Bonus3 = 0;
				//Con = 0;
				if (Con == 10 || Con == 11) {
					Bonus1 = 0;

					System.out.println("Con: [" + Con + "]" + "[" + Bonus3 + "]");
				} else if (Con < 10) {

					for (int i = 10; i >= Con; i--) {
						if (i % 2 == 1) {
							Bonus3++;
						}
					}
					System.out.println("Con: [" + Con + "]" + "[" + "-" + Bonus3 + "]");
				} else {
					for (int i = Con; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus3++;
						}
					}
					System.out.println("Con: [" + Con + "]" + "[" + "+" + Bonus3+ "]");
				}
				

				//bonus for Int 
				int Bonus4 = 0;
				//Str = 0;
				if (Int== 10 || Int == 11) {
					Bonus4 = 0;

					System.out.println("Int: [" + Int + "]" + "[" + Bonus4 + "]");
				} else if (Int < 10) {

					for (int i = 10; i >= Int; i--) {
						if (i % 2 == 1) {
							Bonus4++;
						}
					}
					System.out.println("Int: [" + Int + "]" + "[" + "-" + Bonus4 + "]");
				} else {
					for (int i = Int; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus4++;
						}
					}
					System.out.println("Int: [" + Int+ "]" + "[" + "+" + Bonus4 + "]");
				}
				
				
				//bonus for Wis
				int Bonus5 = 0;
				//Wis= 0;
				if (Wis == 10 || Wis== 11) {
					Bonus1 = 0;

					System.out.println("Wis: [" + Wis + "]" + "[" + Bonus5 + "]");
				} else if (Wis < 10) {

					for (int i = 10; i >= Wis; i--) {
						if (i % 2 == 1) {
							Bonus5++;
						}
					}
					System.out.println("Wis [" + Wis + "]" + "[" + "-" + Bonus5 + "]");
				} else {
					for (int i = Wis; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus1++;
						}
					}
					System.out.println("Wis: [" + Wis+ "]" + "[" + "+" + Bonus5+ "]");
				}
				
				
				
				//bonus for Cha
				int Bonus6 = 0;
				//Cha = 0;
				if (Cha == 10 || Cha == 11) {
					Bonus6 = 0;

					System.out.println("Cha: [" + Cha + "]" + "[" + Bonus6 + "]");
				} else if (Cha < 10) {

					for (int i = 10; i >= Cha; i--) {
						if (i % 2 == 1) {
							Bonus6++;
						}
					}
					System.out.println("Cha: [" + Cha+ "]" + "[" + "-" + Bonus6 + "]");
				} else {
					for (int i = Cha; i > 10; i--) {
						if (i % 2 == 0) {
							Bonus6++;
						}
					}
					
				System.out.println("Cha: [" + Cha + "]" + "[" + "+" + Bonus6 + "]");
				}
				
				System.out.println("  ");
	        
	        
	        
		
			Hitpoint = level * (Math.random() * 1000 % 6 + 1);
			System.out.println("Hitpoint" + "[" + Hitpoint + "]");
	   
			

			try {

	            
	            w.write("Level "+new Integer(level).toString() +"\n");
	            w.write("Str " +new Integer(Str).toString() +"\n");
	            w.write("Dex " +new Integer(Dex).toString() +"\n");
	            w.write("Con " +new Integer(Con).toString() +"\n");
	            w.write("Cha " +new Integer(Cha).toString() +"\n");
	            w.write("Int " +new Integer(Int).toString() +"\n");
	            w.write("Hitpoint " +new Double(Hitpoint).toString() +"\n");
	          w.close();
	            
			} catch (IOException ex) {
			    // Report
			} finally {
			   try {writer.close();} catch (Exception ex) {/*ignore*/}
			}
			
	   
	   System.out.println("Do You want to continue? (y/n)");
	   Scanner in2 = new Scanner(System.in);
	   String cont =in2.next();
	   if(cont.equals("n")){
		 AttributeSelect();
	    }
	   else
	   {
		   System.out.println("Select Skills :  \n");
           
		   LinkListTest lw = new LinkListTest();
		   lw.LinkedList();
		   
		   
		   System.out.println("\n Select Your Skill :\n");
		   Scanner in3 = new Scanner(System.in);
		   String cont3 =in3.next();
		   
		   switch(cont3){
		   case "Thievery":
			   Skill sk = new Skill("Thievery", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 9, 3);
			   
			   
			   sk.printSkill();
			
			
			   break;
		   case "Survival":
			   Skill sk2 = new Skill("Survival", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 5, 4);
			   
			   
			   sk2.printSkill();
			  
			   break;
			   
		   case "Athletics":
			   Skill sk3 = new Skill("Athletics", "Strength", "Strength measures bodily power, athletic training, and the extent to which you can exert raw physical force.", 3, 1);
			   
			   
			   sk3.printSkill();
			   
			   break;
			   
		   case "Acrobatics":
			   Skill sk4 = new Skill("Acrobatics", "Dexterity", "Dexterity measures agility, reflexes, and balance.", 6, 2);

			   sk4.printSkill();
			 
			   break;
		   
		   }
	
		   File file =
				      new File("D:/statsTest.txt");
				    Scanner sc4 = new Scanner(file);
				 
				    while (sc4.hasNextLine())
				      System.out.println(sc4.nextLine());
		   
		   System.out.println("\nBase Attack Bonus : " + level);
		   System.out.println("Combat :" + level + Bonus1);
		   System.out.println("Damage :" + Bonus1);
           
		   
	   }
	   
	   
   }
           break;
   case 4: System.out.println("Roll method IV.."); 
            break;
   case 5: System.out.println("Exiting");
      exit(0);
      break;
   default: System.out.println("");

   }  
  

}

private static void exit(int j) {
	// TODO Auto-generated method stub
	
}}