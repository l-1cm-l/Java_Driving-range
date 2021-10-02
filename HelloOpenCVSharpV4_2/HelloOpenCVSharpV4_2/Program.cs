using System;
using System.Windows.Forms;
using OpenCvSharp;
using OpenCvSharp.Extensions;

namespace HelloOpenCVSharpV4_2
{
    static class Program
    {
        /// <summary>
        /// アプリケーションのメイン エントリ ポイントです。
        /// </summary>
        [STAThread]
        static void Main()
        {
            var w = 1024;
            var h = 768;
            using (var img = new Mat(new Size(w, h), MatType.CV_8UC3))
            {
                for (int y = 0; y < img.Height; y++)
                {
                    for (int x = 0; x < img.Width; x++)
                    {
                        img.Set(y, x, MyScalar(x, y, x + y));
                    }
                }

                var hello = "Hello OpenCVSharp V4";
                var pos = new Point(50, 100);
                var font = HersheyFonts.HersheyPlain;
                var color = new Scalar(255, 255, 255);

                img.PutText(hello, pos, font, 4.0f, color);

                using (var form = new Form())
                {
                    form.Text = hello;
                    form.Size = new System.Drawing.Size(w, h);
                    form.BackgroundImage = BitmapConverter.ToBitmap(img);
                    form.BackgroundImageLayout = ImageLayout.Stretch;

                    Application.Run(form);
                }
            }
        }
        static int MyScalar(int b, int g, int r)
        {
            return System.Drawing.Color.FromArgb(
                r > 255 ? 255 : r,
                g > 255 ? 255 : g,
                b > 255 ? 255 : b).ToArgb();
        }
    }
}
