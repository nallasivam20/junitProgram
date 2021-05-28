package Programs;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Suite1.class,Suite2.class,Suite3.class})

public class SampleSuiteLevel {
	
	public static void main(String[] args) {
		
	
 //   Result runClasses = JUnitCore.runClasses(Suite1.class,Suite2.class,Suite3.class);
	
		Result runClasses = JUnitCore.runClasses(SampleSuiteLevel.class);
		
	int runCount = runClasses.getRunCount();
	System.out.println("run count is   "+runCount);
	
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("ignore count is  "+ignoreCount);
	long runTime = runClasses.getRunTime();
	System.out.println("run time is  "+runTime);
	int failureCount = runClasses.getFailureCount();
	System.out.println("Failure count is   "+failureCount);
	
	List<Failure> failures = runClasses.getFailures();
	System.out.println("\nfailure size is   "+failures.size());
	for(int i=0;i<failures.size();i++)
		System.out.println(failures.get(i));
	
	
}
}