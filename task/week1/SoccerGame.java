class League{
    private String league; //리그 종류

    public League(){

    }

    public League(String league) {
        this.league = league;
    }

    public String getleague() {
        return league;
    }

    public void setleague(String league) {
        this.league = league;
    }
    
}

class Team extends League{
    private String team_name;//팀 이름

    public Team(){

    }

    public Team(String league, String team_name) {
        super(league);
        this.team_name = team_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }  
}
 class Player extends Team{
     private String player; //선수 이름

    public Player() {
        
    }

    public Player(String league, String team_name, String player) {
        super(league, team_name);
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

}
class Soccer extends Player{
    private String game; //가위 바위 보 승패

    public Soccer() {
        
    }

    public Soccer(String league, String team_name, String player, String game) {
        super(league, team_name, player);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String playGame(Soccer soccer){ 
        if(this.getGame() == "가위" && soccer.getGame() == "바위"){
            return soccer.getTeam_name() + "팀 승리";
        }
        else if(this.getGame() == "가위" && soccer.getGame() == "보"){
            return this.getTeam_name() + "팀 승리";
        }
        else if(this.getGame() == "바위" && soccer.getGame() == "가위"){
            return this.getTeam_name() + "팀 승리";
        }
        else if(this.getGame() == "바위" && soccer.getGame() == "보"){
            return soccer.getTeam_name() + "팀 승리";
        }
        else if(this.getGame() == "보" && soccer.getGame() == "가위"){
            return soccer.getTeam_name() + "팀 승리";
        }
        else if(this.getGame() == "보" && soccer.getGame() == "바위"){
            return this.getTeam_name() + "팀 승리";
        }
        else{
            return "비겼습니다.";
        }
    }// 가위 바위 보를 해서 승패를 가림

    @Override
    public String toString() {
        return "리그 : " + getleague() + "/ 팀 이름 : " + getTeam_name() + "/ 선수 이름 : " + getPlayer() + "/ 가위 바위 보 : " + getGame();
    }
    
}

public class SoccerGame {
    public static void main(String[] args) {
        Soccer soccer1 = new Soccer("epl", "토트넘", "손흥민", "가위"); //리그 / 팀 / 선수 / 승부 순으로 입력
        Soccer soccer2 = new Soccer("epl", "리버풀", "살라", "바위");

        System.out.println(soccer1);
        System.out.println(soccer2);

        System.out.println(soccer1.playGame(soccer2));

        System.out.println("토트넘팀 바위로 승부 변경");
        soccer1.setGame("바위");

        System.out.println(soccer1.playGame(soccer2));
    }
    
}
