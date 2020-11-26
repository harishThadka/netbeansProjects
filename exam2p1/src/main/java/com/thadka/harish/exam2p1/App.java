package com.thadka.harish.exam2p1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        // Reading json data of sampleJson file and displaying output using json-simple library 
        
        System.out.println("*************json-simple**************");
        FileReader reader = new FileReader("sampleJson.json");
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj = (JSONObject) jsonParser.parse(reader);
        System.out.println("Reading data from JSON file");
        System.out.println(jsonObj.toString());

        // Modifying data and displaying output using json-simple library       
        // Adding new keys to the json data
        jsonObj.put("phoneNumber", "6605280000");
        jsonObj.put("emailId", "johnWilliams@gmail.com");
        // Removing gender and birthday key from json data
        jsonObj.remove("gender");
        jsonObj.remove("birthday");
        // Changing age in json data
        jsonObj.replace("age", "30");
        System.out.println("After modifying JSON data: ");
        System.out.println(jsonObj.toString());

        
        System.out.println("*************joda-time***************");
        
        // Calculating duration of days between two dates using joda-time library 
        Instant start = new Instant("2019-01-01");// Creating instance of start date
        Instant end = new Instant("2020-01-01");
        Interval interval = new Interval(start, end);
        long days = interval.toDuration().getStandardDays();
        System.out.println( "Duration between 01/01/2019 and 01/01/2020 is: "+days+" days");
        
        // Converting current date and time to different time zones using joda-time library
        DateTime currentDateAndTime = DateTime.now();
        String format = "MM/dd/YYYY HH:mm";// Displaying date and time in specified format
        System.out.println("Current date and time (US central): "+currentDateAndTime.toString(format));
        // Coverting to differnt time zones
        System.out.println("Current date and time in different time zones: ");
        DateTime usEasternTime = currentDateAndTime.toDateTime(DateTimeZone.forID("America/New_York"));
        System.out.println("1. US Eastern Date and Time: "+usEasternTime.toString(format));
        DateTime usPacificTime = currentDateAndTime.toDateTime(DateTimeZone.forID("America/Los_Angeles"));
        System.out.println("2. US Pacific Date and Time: "+usPacificTime.toString(format));
        DateTime usHawaiiTime = currentDateAndTime.toDateTime(DateTimeZone.forID("America/Adak"));
        System.out.println("3. US Hawaii Date and Time: "+usHawaiiTime.toString(format));
        DateTime europeTime = currentDateAndTime.toDateTime(DateTimeZone.forID("Europe/London"));
        System.out.println("4. Europe Date and Time: "+europeTime.toString(format));
        DateTime asiaTime = currentDateAndTime.toDateTime(DateTimeZone.forID("Asia/Kolkata"));
        System.out.println("5. India Date and Time: "+asiaTime.toString(format));
        
        
        System.out.println("*************commons-math3***************");
        // Calculating statistics of below numbers using math3 library
        int[] values = new int[]{10, 2, 38, 23, 38, 23, 21};
        DescriptiveStatistics statistics = new DescriptiveStatistics();
        for (int value : values) {
            statistics.addValue(value);// adding value to the statistics object
        }
        System.out.println("Statistics of given numbers : {10, 2, 38, 23, 38, 23, 21}");
        double mean = statistics.getMean();
        System.out.println("1. Mean: "+mean);
        double median = statistics.getPercentile(50);
        System.out.println("2. Median: "+median);
        double standardDeviation = statistics.getStandardDeviation();
        System.out.println("3. Standard Deviation: "+standardDeviation);
        double variance = statistics.getVariance();
        System.out.println("4. Variance: "+ variance);
        double largest = statistics.getMax();
        System.out.println("5. Largest: "+ largest);
        double smallest = statistics.getMin();
        System.out.println("6. Smallest: "+ smallest);
        
        //Finding GCD, LCM, factorial etc using math3 Library
        System.out.println("Arthimetics calculations: ");
        int gcd = ArithmeticUtils.gcd(24, 60);
        System.out.println("1. GCD of two numbers 24&60 is: "+gcd);
        int lcm = ArithmeticUtils.lcm(24, 60);
        System.out.println("2. LCM of two numbers 24&60 is: "+lcm);
        long factorial = ArithmeticUtils.factorial(5);
        System.out.println("3. Factorial of 5: "+ factorial);
     
        System.out.println("4. 1024 is power of 2? "+ArithmeticUtils.isPowerOfTwo(1024));
        System.out.println("5. 563 is power of 2? "+ArithmeticUtils.isPowerOfTwo(563));
        
        System.out.println("6. 5 raised to the power of 4: "+ArithmeticUtils.pow(5, 4));
        System.out.println("7. 1234 raised to the power of 3: "+ArithmeticUtils.pow(1234, 3));
    }
}
