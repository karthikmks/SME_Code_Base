package util {

import flash.events.Event;
import flash.events.IOErrorEvent;
import flash.net.FileReference;

import mx.controls.Alert;

public class FileIOUtil {
    public static function saveFile(fileData:*, fileName:String):void {
        if (!fileData) {
            return;
        }

        var file:FileReference = new FileReference();
		var dateStr:Date = new Date();
		fileName = fileName+"_"+dateStr.date+"_"+(dateStr.month+1)+"_"+dateStr.fullYear+".pdf.pdf";
		
        file.save(fileData, fileName);
        file.addEventListener(Event.COMPLETE, saveCompleteHandler);
        file.addEventListener(Event.CANCEL, saveCancelHandler);
        file.addEventListener(IOErrorEvent.IO_ERROR, saveIOErrorHandler);
    }

    private static function saveCompleteHandler(event:Event):void {
        cleanupFileReferenceListeners(event.currentTarget as FileReference);
		Alert.show("File saved successfully.","Export to PDF");
    }

    private static function saveCancelHandler(event:Event):void {
        cleanupFileReferenceListeners(event.currentTarget as FileReference);
		Alert.show("File saving fail. Please try again.","Export to PDF");
    }

    private static function saveIOErrorHandler(event:IOErrorEvent):void {
        cleanupFileReferenceListeners(event.currentTarget as FileReference);
        Alert.show("File saving fail.\n\nFailure Message:\n" + event.text, "Fail!");
    }

    private static function cleanupFileReferenceListeners(fileref:FileReference):void {
        fileref.removeEventListener(Event.COMPLETE, saveCompleteHandler);
        fileref.removeEventListener(IOErrorEvent.IO_ERROR, saveIOErrorHandler);
        fileref.removeEventListener(Event.CANCEL, saveCancelHandler);
    }
}
}
