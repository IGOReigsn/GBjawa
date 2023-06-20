//Урок 2. Почему вы не можете не использовать API
//        Формат сдачи: ссылка на подписанный git-проект.
//
//        Задание
//
//        Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//
//        Дополнительные задания
//
//        Дана json-строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
//
//        *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
//        *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.
package org.example;


public class HomeWork2 {
    public static void main(String[] args) {
        String strJson ="{\"name\":\"Иванов\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(strJson + "     Первоначальная JSON-строка");
        String strWhereDraft= strJson.replaceAll("\s","").
                replace("{\"","").
                replace("\":"," = ").
                replace(",\"",", AND ").
                replace("\"}","\"");
        System.out.println(strWhereDraft + "    Черновик WHERE-строки (со вспомогательными запятыми и null)");
        String[] strsplit= strWhereDraft.split(",");
        StringBuilder strBuild = new StringBuilder();
        for (int i=0;i < strsplit.length;i++){
//            System.out.println(strsplit[i]);
            if(strsplit[i].indexOf("null")==-1){
                strBuild.append(strsplit[i]);
            }
        }
        if(strBuild.substring(0,5).equals(" AND ")){//если первое условие= null, убираем из строки ведущий " AND "
            strBuild.delete(0,5);
        }
       System.out.println("Итоговая WHERE-строка (на одном из диалектов SQL):");
       System.out.println(strBuild);
// должно получаться: name = "Иванов" AND country = "Russia" AND city = "Moscow"
        System.out.println();
        System.out.println("ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ :");

        String strJsonAdd="[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(strJsonAdd);
        String[] strsplitAdd= strJsonAdd.split("},");
//        StringBuilder[] strBuildAdd = new StringBuilder[strsplitAdd.length];// STRINGBUILDER не нужен для решения
        String[] strResult= new String[strsplitAdd.length];
        for (int i=0;i < strsplitAdd.length;i++){
//            System.out.println(strsplitAdd[i]);
            strResult[i]=(strsplitAdd[i].
                    replace("[{\"","").
                    replace("{\"","").
                    replace("фамилия\":\"","Студент ").
                    replace("\",\"оценка\":\""," получил ").
                    replace("\",\"предмет\":\""," по предмету ").
                    replace("\"",".").
                    replace("}","").
                    replace("]",""));
            System.out.println(strResult[i]);




        }



    }
}
