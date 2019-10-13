package apache_common_collection_demo;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

public class CollectionUtilsTester {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Integer> integerList = (List<Integer>) CollectionUtils.collect(stringList,
                new Transformer<String, Integer>() {
                    @Override
                    public Integer transform(String input) {
                        return Integer.parseInt(input);
                    }
                });
        System.out.println(integerList);
    }
}