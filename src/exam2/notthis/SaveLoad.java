package exam2.notthis;

import java.io.*;

public class SaveLoad extends FileSaveLoad{

    public SaveLoad(File file) {
        setFile(file);
    }

    public void setFile(File file) {
        if (file == null || !file.getName().endsWith("txt") || file.isDirectory()) {
            this.file = new File("default.txt");
        } else {
            this.file = file;
        }
        try {
            if (this.file.createNewFile()) {
                System.out.println(this.file.getName() + " создан");
            } else {
                System.out.println(this.file.getName() + " уже существует");
            }
        } catch (IOException e) {
            System.out.println("Файл не был создан" + e.getMessage());
        }
    }


    @Override
    public boolean writeToFile(byte[] data) {
        boolean result = false;
        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {     //Если true - будет дозапись в файл
            outputStream.write(data);
            result = true;
        } catch (FileNotFoundException e) {
            System.out.println("Файл для записи не был найден");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
        return result;
    }

    @Override
    public byte[] readFromFile() {
        byte[] result = null;
        try (FileInputStream fileInput = new FileInputStream(file);
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream()){
            byte[] buff = new byte[512];
            int readCount;
            while ((readCount = fileInput.read(buff)) != -1){
                byteArray.write(buff,0,readCount);
            }
            result = byteArray.toByteArray();
        } catch (FileNotFoundException e){
            System.out.println("Файл не был найден");
        } catch (IOException e){
            System.out.println("Ошибка чтения из файла");
        }
        return result;
    }
}
