package Sample.equals;

import java.util.Objects;

//従業員クラス
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {   // object o :すべてのobject
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
            //getClass():クラス名をとってくるメソッド
            //クラスが一緒じゃなかったらfalse
        Employee employee = (Employee) o;//(Employee):キャスト
        return id == employee.id && Objects.equals(name, employee.name);
        //(自分の)id ==employee.id && Objects.equals
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
