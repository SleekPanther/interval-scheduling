import java.util.*;

//Basically a struct container type
class Job implements Comparable<Job>{
	public int start;
	public int finish;
	public String name;

	public Job(int start, int finish, String name){
		this.start=start;
		this.finish=finish;
		this.name=name;
	}

	@Override
	public int compareTo(Job job) {
		return this.finish - job.finish;
	}
	
	@Override
	public String toString(){
		return "[" + name + ": (" + start + ", " + finish + ")]";
	}
}

public class IntervalScheduling {
	
	
	
	public static void findOptimalScheule(Job[] jobs){
		System.out.println(Arrays.toString(jobs));
		Arrays.sort(jobs);
		System.out.println(Arrays.toString(jobs));
	}
	
	
	public static void main(String[] args) {
		Job[] jobs = {
			new Job(0, 6, "a"),
			new Job(1, 4, "b"),
			new Job(3, 5, "c"),
			new Job(3, 8, "d"),
			new Job(4, 7, "e"),
			new Job(5, 9, "f"),
			new Job(6, 10, "g"),
			new Job(8, 11, "h"),
		};
		IntervalScheduling.findOptimalScheule(jobs);
	}
}