import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.util.*;
import java.time.LocalTime;
public class SwimRecords {

    int id;
    LocalDateTime recordDate;
    LocalDate swimTime;


    public static ArrayList<SwimRecords> juniorButterfly = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> juniorCrawl = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> juniorBackcrawl = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> juniorBreaststroke = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> seniorButterfly = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> seniorCrawl = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> seniorBackcrawl = new ArrayList<SwimRecords>();
    public static ArrayList<SwimRecords> seniorBreaststroke = new ArrayList<SwimRecords>();

    public SwimRecords(int id, LocalDateTime recordDate, LocalDate swimTime){
        this.id = id;
        this.recordDate = recordDate;
        this.swimTime = swimTime;

    }


}
