import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class strings_Java {
    public static void main(String[] args) {
//        stringExample();
//        string_byte();
//        string_basic();
//        StringBuilder1();
//        StringBuilderExample();
//        StringBufferExample();
//        string_pool();
//        efficiency();

//        text_string();


        String s = """
Bạn sinh sống ở Nhổn, bước lên tàu điện và 13 phút sau bạn đã có mặt ở đầu phố Đê La Thành. Tuyến tàu điện mới đang thay đổi cảm nhận về không gian của người dân phía tây Hà Nội.
Dân công sở ngày đầu đi tàu điện Nhổn, thoát cảnh ùn tắc trên đường 32
Không giống một người dân hiếu kỳ đi trải nghiệm, đối với Thùy Dung, thói quen đi làm bằng tàu điện sẽ bắt đầu từ hôm nay.

Sáng 8/8, trong ngày đầu tiên vận hành tàu điện Nhổn - ga Hà Nội, Dung không còn phải vịn tay ga len qua đám đông xe cộ. Cô cầm theo một túi đồ ăn trưa và chiếc ô gấp, nhanh nhẹn bước lên tuyến tàu điện nối thẳng từ nhà đến chỗ làm.

Dân công sở ngày đầu đi tàu điện Nhổn, thoát cảnh ùn tắc trên đường 32 - 1
Người dân xếp hàng trải nghiệm tàu điện Nhổn - Cầu Giấy trong sáng 8/8 (Ảnh: Ngọc Tân).

Dấu gạch nối giữa nội đô và ngoại thành
Nhà ở Phú Diễn (quận Bắc Từ Liêm), văn phòng làm việc ở đường Xuân Thủy (quận Cầu Giấy), Thùy Dung (lập trình viên) đã nếm đủ nỗi khổ tắc đường khi đi xe máy qua trục đường Hồ Tùng Mậu (quốc lộ 32) để đến công ty.

Dân công sở ngày đầu đi tàu điện Nhổn, thoát cảnh ùn tắc trên đường 32 - 2
Với phương tiện mới là tàu điện, Thùy Dung kết thúc chuỗi ngày đi làm bằng xe máy từ hôm nay (Ảnh: Ngọc Tân).

"Đi tàu điện có điều hòa mát mẻ, không khói bụi, thời gian di chuyển nhanh gấp đôi xe máy", nữ lập trình viên liệt kê các tiện ích của tuyến tàu điện từ Nhổn đi Cầu Giấy. Sau khi xuống tàu tại ga Đại học Quốc gia, cô khẳng định sẽ để xe máy ở nhà, bắt đầu đi làm bằng tàu điện từ hôm nay.

Theo ước tính, nội thành Hà Nội có khoảng 7 triệu dân. Mỗi buổi sáng, có thêm 3 triệu lao động ngoại thành vào làm việc. Lượng người ra vào nội đô trong 2 khung giờ cao điểm sáng/chiều là lý do khiến các trục đường xuyên tâm như Nguyễn Trãi, Lê Văn Lương, Hồ Tùng Mậu - Cầu Giấy... thường xuyên ùn tắc.

Dân công sở ngày đầu đi tàu điện Nhổn, thoát cảnh ùn tắc trên đường 32 - 3
Tuyến metro như dấu gạch nối giữa vùng ngoại thành Nhổn, Tây Tựu... với trung tâm Hà Nội (Ảnh: Ngọc Tân).

Năm 2021, tuyến đường sắt Cát Linh - Hà Đông được đưa vào vận hành đã giúp giảm tải đáng kể cho trục đường Nguyễn Trãi. Hôm nay, đến lượt tàu điện trên cao Nhổn - Cầu Giấy trở thành phương tiện giao thông tiện lợi cho người dân trên trục đường 32 - Xuân Thủy - Cầu Giấy.

"Công nghệ của tuyến Nhổn - Ga Hà Nội hiện đại hơn, khả năng thu hút khách sẽ ngang bằng, thậm chí hơn tuyến Cát Linh - Hà Đông vì nó đi qua rất nhiều trường đại học", ông Vũ Hồng Trường, Tổng giám đốc Hanoi Metro, chia sẻ.

Ước tính, 8 nhà ga trên cao từ Nhổn đến Cầu Giấy sẽ phục vụ đắc lực cho sinh viên của nhiều trường đại học như Đại học Công Nghiệp, Tài nguyên Môi trường, Đại học Thương Mại, Cao đẳng Múa, Đại học Quốc gia Hà Nội, Đại học Sư phạm, Đại học GTVT...
                """;

        String regex = "[\\s,.\\-():\"/]";


        String[] words = s.split(regex);


        Map<String, Integer> wordsCount = new HashMap<>();
        for(String word: words){
            if(!word.isEmpty()){
                wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
                System.out.println(word);
            }
        }

        String mostFrequenword = null;
        int maxCount = 0;

        for(Map.Entry<String, Integer> entry: wordsCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequenword = entry.getKey();
            }
        }
        if(mostFrequenword != null){
            System.out.println("Tu xuat hien nhieu lan nhat: " + mostFrequenword);
            System.out.println("So lan xuat hien: " + maxCount);
        }
    }

    private static void text_string() {
        String text = "As the name suggests, Object-Oriented Programming or Java OOPs concept refers to languages that use objects in programming, they use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks you assign.";
        String foundText = "name";
        if (text.contains(foundText)) {
            System.out.println("Chuoi ky tu chua chu: " + foundText);
        }

        if (text.toLowerCase().contains(foundText)) {
            System.out.println("Chuoi ky tu chua chu: " + foundText + " (khong phan biet hoa/thuong)");
        }
    }

    private static void efficiency() {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            sb.append(" World");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + " ms");
    }

    private static void string_pool() {
        String str1 = "aaa";
        String str2 = "aaa";
        //So sánh 2 phần tử
        System.out.println(str1 == str2); // Return true
        System.out.println(str1.equals(str2));  // true


        String s3 = new String("aaa");
        String s4 = new String("aaa");
        System.out.println(s3 == s4); // false

        System.out.println(s3.equals(s4)); //true


        String str3 = new String("Apple");//Tạo 1 chuỗi mới trong Heap Memory
        System.out.println(str1 == str3);// Return false

        System.out.println(str1.equals(str3));// So sánh nội dung

        String str4 = str3.intern();
        System.out.println(str1 == str4);

        // primitive: int, boolean, float
        // reference: object
    }

    private static void StringBufferExample() {
        StringBuffer str = new StringBuffer();
        str.append("Hello");
        str.append(" ");
        str.append("Java");
        System.out.println(str.toString());

        str.replace(5, 6, "bbb");
        System.out.println(str.toString());

        str.insert(6, " ");
        System.out.println(str.toString());

        str.delete(0, 11);
        System.out.println(str.toString());

        str.reverse();
        System.out.println(str.toString());
    }

    private static void StringBuilderExample() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Everybody!");
        System.out.println(sb.toString());

        sb.insert(16, "\nwelcome to party");
        System.out.println(sb.toString());

        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString());

        sb.delete(0, 14);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }

    private static void StringBuilder1() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GFG");
        System.out.println("String = " + stringBuilder.toString());

        StringBuilder str = new StringBuilder("AAAABBBCCCC");
        System.out.println("String1 = " + str.toString());

        StringBuilder strReverse = str.reverse();
        System.out.println("Reverse: " + strReverse.toString());

        str.appendCodePoint(44);
        System.out.println("Modified StringBuilder = "
                + str);

        int capacity = str.capacity();
        System.out.println("Capacity of StringBuilder = " + capacity);

        StringBuilder str1 = new StringBuilder(10);
        System.out.println("String2 capacity: " + str1.capacity());

        StringBuilder str2 = new StringBuilder(str.toString());
        System.out.println("String3 = " + str2.toString());
    }

    private static void string_basic() {
        String s = "Remember go to the movie";
        System.out.println("Output: " + s);

        String s1 = " the future";
        String s2 = s.concat(s1);
        System.out.println(s2);

        System.out.println("Length: " + s.length());
        System.out.println("Char at: " + s.charAt(5));
        System.out.println("Upper case: " + s.toUpperCase());
        System.out.println("Lower case: " + s.toLowerCase());

        // Trimming the word
        String word4 = " \nLearn Share Learn ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f', 'g');
        System.out.println("Replaced f with g -> " + str2);

        //Search không phân biệt
    }

    private static void string_byte() {
        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte = new String(b_arr);
        System.out.println(s_byte);

        String str = "Geeks";
        byte[] byteArr = str.getBytes();
        System.out.println("Ket qua la: " + Arrays.toString(byteArr));

        byte[] y_arr = {71, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        String s_byte_char = new String(y_arr, 1, 3, cs);
        System.out.println("In ra: " + s_byte_char);

        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
        String ss = new String(char_arr);
        System.out.println("Output: " + ss);

        StringBuffer s_buffer = new StringBuffer("Waiting");
        String string = new String(s_buffer);
        System.out.println(string);

        StringBuilder s_builder = new StringBuilder("Stop here");
        String builder = new String(s_builder);
        System.out.println("Check out: " + builder);
    }

    private static void stringExample() {
        String str = new String("example");

        System.out.println(str);
    }

}