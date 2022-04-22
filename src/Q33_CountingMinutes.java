import java.util.Arrays;

public class Q33_CountingMinutes {
    /*
     *	Using the Java language, have the function CountingMinutesI(str) take the str parameter being passed
     *	which will be two times (each properly formatted with a colon and am or pm) separated by a hyphen
     *	and return the total number of minutes between the two times.
     *
     *	The time will be in a 12 hour clock format.
     *
     * 	For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
     *
     * 	Sample:-
     *  		Input = "12:30pm-12:00am"	Output = 690
     *  		Input = "1:23am-1:08am"		Output = 1425
     * deneme
     */

    public static void main(String[] args) {

        String str = "9:30am-10:31am";
        int min=0;

        String[] times=str.split("-");
        System.out.println(Arrays.toString(times));

        String dayNight1=times[0].substring(times[0].length()-2); //am
        System.out.println(dayNight1);

        String dayNight2=times[1].substring(times[1].length()-2);//am
        System.out.println(dayNight2);

        if (!dayNight1.equals(dayNight2))
            min+=720;

        String hour1=times[0].substring(0,times[0].indexOf(":"));//9
        String hour2=times[1].substring(0,times[1].indexOf(":"));//10

        String min1= times[0].substring(times[0].indexOf(":") +1, times[0].length() - 2);
        System.out.println(min1);
        String min2=times[1].substring(times[1].indexOf(":"));
        System.out.println(min2);
    }
}
