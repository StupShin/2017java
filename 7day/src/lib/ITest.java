package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ITest {
	public abstract void makeTest(ArrayList<String> unsort);
	public abstract HashMap<String,String> doTest(List<String> nameList);
}
//생성자는 빼고~!

