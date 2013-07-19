/**
 * Proiectarea Algoritmilor, 2013
 * Lab 4: Backtracking si optimizari
 * Task 2: Queen Positioning Problem - Backtracking + AC3
 *
 * @author 	Cristian Condurache
 * @email	cristian.condurache@cti.pub.ro
 */
import java.util.ArrayList;

public class Queen implements Cloneable {
	public int column;
	public ArrayList<Integer> domain;

	public Queen() {
		domain = new ArrayList<Integer>();
	}

	public Queen(int column, int n) {
		this.column = column;
		domain = new ArrayList<Integer>();
		for(int i = 0; i < n; i++)
			domain.add(i);
	}

	public void setValue(int value) {
		domain.clear();
		domain.add(value);
	}

	@Override
	public Object clone() {

		Queen q = new Queen();
		q.column = this.column;
		for(Integer i : domain)
			q.domain.add(i);
		return q;
	}

	@Override
	public String toString() {
		return "( " + column + ", " + domain + ")";
	}
}
