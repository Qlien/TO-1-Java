package testowanie1.java;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
public class SectionE{
    
    private int people_count, defects, important_defects, less_important_defects, inspection_time,
                inspection_prep_time, lines_of_code, inspection_efficiency, avg_salary; 

    Scanner in = new Scanner(System.in);
    
    public void count()
    {
        try
        {
            System.out.println("Liczba osób biorących udział w inspekcji:");
            setPeople_count(in.nextInt());
            System.out.println("Liczba wszystkich defektów:");
            setDefects(in.nextInt());
            System.out.println("Liczba istotnych defektów:");
            setImportant_defects(in.nextInt());
            System.out.println("Liczba nieistotnych defektów:");
            setLess_important_defects(in.nextInt());
            if((getImportant_defects()+getLess_important_defects())!=getDefects())
            {
                System.err.print("Liczba istotnych i nieistotnych błędów nie zgadza się.");
                return;
            }
            System.out.println("Czas inspekcji (w minutach):");
            setInspection_time(in.nextInt());
            System.out.println("Czas przygotowania do inspekcji (w minutach):");
            setInspection_prep_time(in.nextInt());
            System.out.println("Liczba przeanalizowanych linii kodu:");
            setLines_of_code(in.nextInt());
            System.out.println("Średnie wynagrodzenie pracownika za godzinę w PLN:");
            setAvg_salary(in.nextInt());
        }
        catch(Exception e)
        {
            System.err.print("Niepoprawne dane");
        }
        try
        {
            System.out.println("Wyniki inspekcji:\n");
            System.out.println("Efektywność (linie kodu)/(na minutę): " + lines_of_code/inspection_time);
            System.out.println("Efektywność (linie kodu)/(na osobogodzinę): " + lines_of_code/(Math.ceil((double)inspection_time/60d)));
            System.out.println("Całkowity koszt inspekcji: " + Math.ceil(((double)((inspection_prep_time + inspection_time) * people_count)))/60 * avg_salary);
        }
        catch(Exception e)
        {
            System.err.print("Błąd obliczeń");
        }
        in.nextInt();
        
    }

    
    public int getPeople_count() {
        return people_count;
    }

    public void setPeople_count(int people_count) {
        this.people_count = people_count;
    }
    
    public int getDefects() {
        return defects;
    }

    public void setDefects(int defects) {
        this.defects = defects;
    }

    public int getImportant_defects() {
        return important_defects;
    }

    public void setImportant_defects(int important_defects) {
        this.important_defects = important_defects;
    }

    public int getLess_important_defects() {
        return less_important_defects;
    }

    public void setLess_important_defects(int less_important_defects) {
        this.less_important_defects = less_important_defects;
    }

    public int getInspection_time() {
        return inspection_time;
    }

    public void setInspection_time(int inspection_time) {
        this.inspection_time = inspection_time;
    }

    public int getInspection_prep_time() {
        return inspection_prep_time;
    }

    public void setInspection_prep_time(int inspection_prep_time) {
        this.inspection_prep_time = inspection_prep_time;
    }
    
    public int getLines_of_code() {
        return lines_of_code;
    }

    public void setLines_of_code(int lines_of_code) {
        this.lines_of_code = lines_of_code;
    }

    public int getEfficiency() {
        return inspection_efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.inspection_efficiency = efficiency;
    }

    public int getAvg_salary() {
        return avg_salary;
    }

    public void setAvg_salary(int avg_salary) {
        this.avg_salary = avg_salary;
    }
}
