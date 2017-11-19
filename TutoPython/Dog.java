public class Dog
{
    //Instance vars
    private String theName;
    private int age = 0;
    private double weight;

    //constructor
    public Dog(final String initName)  {
        theName = initName;
        age = 0;
    }

    //methods
    public String getName()
    {
        return theName;
    }

    public void setName()
    {
        return theName;
    }

    public int getAge()
    {
        return age;
    }

    public int getDogYears()
    {
        return age*5;
    }

    public void addAYear()
    {
        age = age + 1;
    }

    public void setAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }
    void barking() {
    }

    public void setWeight()
    {
        weight = weight;
    }
    
    void hungry() {
    }

    public String getData()
    {
        String data = "";
        data = theName;
        data = data + "\n\tAge: " + age;
        data = data + "\n\tWeight: " + weight;


        return data;
        
   }
   
   void sleeping() {
   }
}
