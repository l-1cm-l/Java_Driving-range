using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenCvSharp;

namespace OpenCV_Test
{
    class Program
    {
        static void Main(string[] args)
        {
            using (var img = new IplImage(@"/Users/admin/workspace/T est.png"))
            {
                Cv.SetImageROI(img, new CvRect(200, 200, 180, 200));
                Cv.Not(img, img);
                Cv.ResetImageROI(img);
                using (new CvWindow(img))
                {
                    Cv.WaitKey();
                }
            }
        }
    }
}