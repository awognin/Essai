public class Dog
{
    //Instance vars
    private String name;
    private int age = 0;
    private double weight;

    //constructor
    public Dog(String initName)
    {
        name = initName;
        age = 0;
        weight = 0;
    }

    //methods
    public String getName()
    {
        return name;
    }

    public void setName()
    {
        return name;
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
        data = name;
        data = data + "\n\tAge: " + age;
        data = data + "\n\tWeight: " + weight;


        return data;
        
   }
   
   void sleeping() {
   }
}
