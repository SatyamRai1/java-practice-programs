public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26,0.75));
    }



    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }else{
            double areaToPaint=height*width;
            int totalBuckets=(int)Math.ceil(areaToPaint/areaPerBucket);
            int bucketsToOrder= totalBuckets-extraBuckets;

            return bucketsToOrder;
        }

    }

    public static int getBucketCount(double width,double height,double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double areaToPaint = height * width;
            return (int) Math.ceil(areaToPaint / areaPerBucket);


        }


    }


    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }else{

            return (int)Math.ceil(area/areaPerBucket);

        }

    }



}
