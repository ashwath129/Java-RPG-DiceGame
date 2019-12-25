package gui;


class Skill {
   public String name;
   public String optional;
   public String short_desc;
   public int stat_affinity;
   public int ranks;
   public Skill next_Skill;

   public Skill(String name, String optional, String short_desc, int stat_affinity, int ranks) {
       this.name = name;
       this.optional = optional;
       this.short_desc = short_desc;
       this.stat_affinity = stat_affinity;
       this.ranks = ranks;
   }

   public String getName() {
       return name;
   }

   public String getOptional() {
       return optional;
   }

   public String getShort_desc() {
       return short_desc;
   }

   public int getStat_affinity() {
       return stat_affinity;
   }

   public int getRanks() {
       return ranks;
   }

   public Skill getNext_Skill() {
       return next_Skill;
   }

   public void printSkill() {
       System.out.print("{" + name + ", " + optional +", " + short_desc + ", " + stat_affinity + ","+ ranks + "} ");
   }
}

class Skill_linkedList {
   private Skill first;


   public Skill_linkedList() {
       first = null;
   }


   public boolean isEmpty() {
       return first == null;
   }


   public void insert(String name, String optional, String short_desc, int stat_affinity, int ranks) {
       Skill link = new Skill( name , optional, short_desc , stat_affinity , ranks);
       link.next_Skill = first;
       first = link;
   }


   public Skill delete() {
       Skill temp = first;
       if(first == null){
           return null;

       }
       first = first.next_Skill;
       return temp;
   }



   public void printList() {
       Skill currentLink = first;
       System.out.print("List: ");
       while(currentLink != null) {
           currentLink.printSkill();
           currentLink = currentLink.next_Skill;
           System.out.println("");
       }

   }

   private static void get(int i) {

   }
}

class LinkListTest {
   public static void LinkedList() {
       Skill_linkedList Skill_linkedList = new Skill_linkedList();
       Skill_linkedList.insert("Thievery", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 9, 3);
       Skill_linkedList.insert("Survival", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 5, 4);
       /*Skill_linkedList.insert("Streetwise", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 6, 4);
       Skill_linkedList.insert("Stealth", "Dexterity", "Dexterity measures agility, reflexes, and balance.", 8, 2);
       Skill_linkedList.insert("Religion", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 4, 3);
       Skill_linkedList.insert("Performance", "Charisma", "Charisma measures your ability to interact effectively with others.", 5, 5);
       Skill_linkedList.insert("Perception", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 3, 4);
       Skill_linkedList.insert("Nature", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 8, 3);
       Skill_linkedList.insert("Investigation", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 9, 3);
       Skill_linkedList.insert("Intimidate", "Charisma", "Charisma measures your ability to interact effectively with others.", 8, 5);
       Skill_linkedList.insert("Insight", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 5, 4);
       Skill_linkedList.insert("History", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 5, 3);
       Skill_linkedList.insert("Heal", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 4, 4);
       Skill_linkedList.insert("Endurance", "Strength", "Strength measures bodily power, athletic training, and the extent to which you can exert raw physical force.", 5, 1);*/
       Skill_linkedList.insert("Athletics", "Strength", "Strength measures bodily power, athletic training, and the extent to which you can exert raw physical force.", 3, 1);
      /* Skill_linkedList.insert("Arcana", "Intelligence", "Intelligence measures mental acuity, accuracy of recall, and the ability to reason.", 5, 3);
       Skill_linkedList.insert("Animal Handling", "Wisdom", "Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.", 7, 4);*/
       Skill_linkedList.insert("Acrobatics", "Dexterity", "Dexterity measures agility, reflexes, and balance.", 6, 2);


       Skill_linkedList.printList();


   }
}