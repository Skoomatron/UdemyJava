public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        boolean checkWidth = width <= 0;
        boolean checkHeight = height <= 0;
        boolean checkArea = areaPerBucket <= 0;
        boolean checkExtra = extraBuckets < 0;
        if (checkArea || checkExtra || checkHeight || checkWidth) {
            return -1;
        } else {
            double area = width * height;
            return getBucketCount(area, areaPerBucket) - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        boolean checkWidth = width <= 0;
        boolean checkHeight = height <= 0;
        boolean checkArea = areaPerBucket <= 0;

        if (checkArea || checkWidth || checkHeight) {
            return -1;
        } else {
            double area = width * height;
            return getBucketCount(area, areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        boolean checkAPB = areaPerBucket <= 0;
        boolean checkArea = area <= 0;

        if (checkArea || checkAPB) {
            return -1;
        } else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }
}