package ru.job4j.lists;

/**
 * Class User.
 * @author Sergey Artemov
 * @since 06.11.2017
 * @version 1
 */
public class User implements Comparable<User> {
    /**
     *
     */
    private int id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String city;
    /**
     *
     */
    private int age;

    /**
     * getAge.
     * @return ****
     */
    public int getAge() {
        return age;
    }

    /**
     * setAge.
     * @param age ****
     */
    public void setAge(int age) {
        this.age = age;
    }



    /**
     * Class constructor.
     * @param id **id**
     * @param name **name**
     * @param city **city**
     * @param age **age**
     */
    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    /**
     *
     * @param id ****
     * @param name ****
     * @param city ****
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = 18;
    }

    /**
     *
     * @return ****
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id ****
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return ****
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name ****
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return ****
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param  city ****
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(User o) {
        // учитываем, что у разных людей может быть одинаковый возраст
        return (this.age < o.age ? -1 : (this.age > o.age ? 1 : this.id - o.id));
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        if (age != user.age) {
            return false;
        }
        if (name != null ? !name.equals(user.name) : user.name != null) {
            return false;
        }
        return city != null ? city.equals(user.city) : user.city == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


}
