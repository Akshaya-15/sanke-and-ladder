import java.util.Queue;
import java.lang.Math;
//Uc1 for position 0
public class SnakeLadder{
private int start_position=0;
private int end_position=100;

	public SnakeLadder(int start_poistion,int end_position){
		this.start_position=0;
		this.end_position=100;
}
		public int getStart_position(){
			return 0;
}
		public int getEnd_position(){
		return 100;
}
}
//UC2 for roll and dice between 1 to 6 
 class DiceService{
    private int diceroll() {
        return new Random().nextInt(6) + 1; 
