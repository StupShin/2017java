package lib;

import java.util.ArrayList;
import java.util.List;

public interface IAttendance {
	public abstract void checkAttendance(List<String> arrayList);
	public abstract void showAttendance();
	public abstract ArrayList<String> getPresentList();
}
