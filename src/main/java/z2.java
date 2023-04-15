class Tester{
    public String name;
    public String surname;
    public int expirienceInYears;
    public String englishLevel;
    public double salary;

    public Tester(String name,String surname,int expirienceInYears,String englishLevel,double salary){
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name,String surname,int expirienceInYears){
        this(name, surname, expirienceInYears, "A1");
    }
    public Tester(String name,String surname,int expirienceInYears, String englishLevel){
        this(name, surname, expirienceInYears, englishLevel, 800.0);
    }
    public Tester(String name,String surname){
        this(name, surname, 0);
    }



    public void setZp(double expirienceInYears, double salary){
        this.salary = salary *= expirienceInYears;
    }
    public void setZp(String name, String surname, String englishLevel){
        this.name = name + " " + surname + " " + englishLevel;
    }
    public void setZp(int expirienceInYears, double rate){
        this.expirienceInYears = expirienceInYears * (int) rate;
    }


    public void opit(){
        if(name == " " || surname == " " || englishLevel == " "){
            return;
        }
    }
    public void otchet(int expirienceInYears, String englishLevel){
        if (expirienceInYears < 1){
            englishLevel = "Новичок";
        }
        else
        {
            englishLevel = "Носитель";
        }

    }
    public void Show(){
        System.out.println(name + " " + surname + " " + englishLevel + " " + expirienceInYears + " " + salary);
    }
    public static void printTesterInfo(Tester tester) {
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.surname);
        System.out.println("Годы обучения: " + tester.expirienceInYears);
        System.out.println("Уровень знания языка: " + tester.englishLevel);
        System.out.println("Заработная плата: " + tester.salary);
    }
}
