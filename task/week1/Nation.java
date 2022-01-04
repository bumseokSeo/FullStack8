public class Nation {
    private String name; //나라이름
    public int area; //면적
    public int population; //인구
    private static String Planet; //행성이름

    public Nation(){

    }

    public Nation(String name, int area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public void printPlanet(){
        
        System.out.println(this.Planet);
    }

    public void setPlanet(String Planet){
        this.Planet = Planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Nation [area=" + area + ", name=" + name + ", population=" + population + "]";
    }

    
}

class Korea extends Nation{
    private String food = "라면";
    
    public Korea(){

    }

    public Korea(String name, int area, int population, String food) {
        super(name, area, population);
        this.food = food;
    }

    public void setFood(String food){
        this.food = food;
    }
}

class Japan extends Nation{
    private int GDP = 1000000;

    public Japan(){

    }

    

    public Japan(String name, int area, int population, int GDP) {
        super(name, area, population);
        this.GDP = GDP;
    }



    public void setGDP(int GDP){
        this.GDP = GDP;
    }
}

class China extends Nation{
    private String language = "chinese";

    public China(){

    }

    public China(String name, int area, int population, String language) {
        super(name, area, population);
        this.language = language;
    }

    public void setLanguage(String language){
        this.language = language;
    }
}