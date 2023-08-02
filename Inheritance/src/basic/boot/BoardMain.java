package basic.boot;

import basic.app7.Board;
import basic.app7.CentralBoard;
import basic.app7.Degree;
import basic.app7.HighSchool;
import basic.app7.PreCollege;
import basic.app7.School;
import basic.app7.StateBoard;
import basic.app7.University;

public class BoardMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Board");
		Board board=new Board();
		System.out.println(board.board);
		board.teaches();
		System.out.println("_____________________________");
		
		Board board1=new  CentralBoard();
		CentralBoard cb=new CentralBoard();
		System.out.println(board1.board);
		board1.teaches();
		System.out.println(cb.name);
		cb.educates();
		System.out.println("_____________________________");
		
		Board board2=new  StateBoard();
		StateBoard sb=new StateBoard();
		System.out.println(board2.board);
		board2.teaches();
		System.out.println(sb.name);
		sb.educates();
		System.out.println("_____________________________");
		
		Board board3=new  School();
		School school=new School();
		System.out.println(board3.board);
		board3.teaches();
		System.out.println(school.name);
		school.educates();
		System.out.println("_____________________________");
		
		Board board4=new  HighSchool();
		HighSchool hs=new HighSchool();
		System.out.println(board4.board);
		board4.teaches();
		System.out.println(hs.name);
		hs.educates();
		System.out.println("_____________________________");
		
		Board board5=new  PreCollege();
		PreCollege pc=new PreCollege();
		System.out.println(board5.board);
		board5.teaches();
		System.out.println(pc.name);
		pc.educates();
		System.out.println("_____________________________");
		
		Board board6=new  Degree();
		Degree degree=new Degree();
		System.out.println(board6.board);
		board6.teaches();
		System.out.println(degree.name);
		degree.educates();
		System.out.println("_____________________________");
		
		Board board7=new  University();
		University university=new University();
		System.out.println(board7.board);
		board7.teaches();
		System.out.println(university.name);
		university.educates();
		System.out.println("_____________________________");
		
		
}
}
