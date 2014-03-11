/**
 * Created with IntelliJ IDEA.
 * User: Gert
 * Date: 1/03/12
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
package util {
import org.alivepdf.colors.IColor;
import org.alivepdf.colors.RGBColor;
import org.alivepdf.drawing.Joint;
import org.alivepdf.fonts.CoreFont;
import org.alivepdf.fonts.FontFamily;
import org.alivepdf.layout.Align;
import org.alivepdf.layout.Orientation;
import org.alivepdf.layout.Size;
import org.alivepdf.layout.Unit;
import org.alivepdf.pages.Page;
import org.alivepdf.pdf.PDF;

public class PdfConstants {

    public static const LEFT_MARGIN:int = 7;
    public static const TOP_MARGIN:int = 10;
    public static const BOTTOM_MARGIN:int = 10;
    public static const RIGHT_MARGIN:int = 7;

    public static const GRID_WIDTH:int = 110;
    public static const GRID_HEIGHT:int = 100;

    public static const HEADER_COLOR:IColor = new RGBColor(0xFAFAFA);
    public static const CELL_COLOR:IColor = new RGBColor(0xFFFFFF);
    public static const BORDER_COLOR:IColor = new RGBColor(0xB3B3B3);

    public static const BORDER_ALPHA:int = 1;

    public static const JOINTS:String = Joint.MITER;

    public static const ALTERNATE_ROW_COLOR:Boolean = false;

    public static const HEADER_ALIGN:String = Align.CENTER;
    public static const CELL_ALIGN:String = Align.LEFT;



    public static function createPdf():PDF {
        var pdf:PDF = new PDF(Orientation.LANDSCAPE, Unit.MM, Size.A4);
        pdf.setMargins(LEFT_MARGIN, TOP_MARGIN, RIGHT_MARGIN, BOTTOM_MARGIN);

        var page:Page = new Page(Orientation.LANDSCAPE);
        pdf.addPage(page);

        pdf.textStyle(new RGBColor(0x333333));
        pdf.setFont(new CoreFont(FontFamily.HELVETICA), 8);

        return pdf;
    }
}
}
