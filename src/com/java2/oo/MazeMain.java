package com.java2.oo;

/*
 * 有一遊戲場地,長寬由執行當時決定,場地中亂數產生陷阱,陷阱者
一個玩家

有個檔案(maze.txt)資訊如下:
6,4(長,寬)
5(陷阱數)
6,8,2,4,2,2,6,6,8,4,2,2,6(走的方向,2下,4左,6右,8上)
*/
public class MazeMain {
     public Maze(){
    	 
     }
	
	public static void main(String[] args) {
     new Maze();
	}
	
	
//不是很了解為什麼不用()	
	class Maze{
		int col,row;
		int trapcount;
		int[] trap;
		Player player;
		
		public void Maze(int col, int row, int trapcount){
          this.col=col;
          this.row=row;
          this.trapcount=trapcount;
		}
	}
    class Player{
    	
    }
}
