import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int groupCount1 = stream1.getSize();
        int groupCount2 = stream2.getSize();
        return Integer.compare(groupCount1, groupCount2);
    }
}