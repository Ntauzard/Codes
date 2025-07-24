

public class Member
{
    private String name;
    private int age;
    private int matchesWon;
    
    public Member(){
        
    }
    
    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        
        return name;
    }
    
    public int getAge(){
        
        return age;
    }
    
    public int getMatchesWon(){
    
        return matchesWon;
    }
    
    public void setMatchesWon(int matchesWon){
        this.matchesWon = matchesWon;
    }
    
    public String determineCategory(){
        String category ="";
        
        if(age < 16){
            category= "junior";
        }
        else if(age > 45){
            category = "retired";
        }
        else{
            category = "senior";
        }
        
        return category;
    }
    
    public char determineRating(){
        char rating;
        
        switch(matchesWon){
            case 26:
                rating = 'A';
                break;
            case 20: case 21: case 22: 
            case 23: case 24: case 25:
                rating = 'B';
                break;
            case 15: case 16: case 17:
            case 18: case 19:
                rating = 'C';
                break;
            case 10: case 11: case 12:
            case 13: case 14:
                rating = 'D';
                break;
            default:
                rating = 'E';
                break;
            
                
                
        }
        
        return rating;
    }
    @Override
    public String toString(){
        String str = String.format(name + " as the name," + age+" as the person's age and "+ matchesWon+" matches won;");
        
        
        return str;
    }
}
