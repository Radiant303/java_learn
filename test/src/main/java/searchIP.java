
import net.cz88.czdb.DbSearcher;
import net.cz88.czdb.QueryType;

public class searchIP {
    public static void main(String[] args) throws Exception {
        DbSearcher searcher = new DbSearcher("D:/JAVA_Learning/java上/javalearn/basic-code/test/src/main/resources/cz88_public_v4.czdb", QueryType.MEMORY, "BWq+O6v/SAQWH4LOfpaVjg==");
        String region = searcher.search("198.235.24.246");
        System.out.println("region = " + region);
    }
}
