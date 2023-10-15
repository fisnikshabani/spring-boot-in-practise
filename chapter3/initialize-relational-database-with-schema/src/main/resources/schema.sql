CREATE TABLE courses (
    id serial PRIMARY KEY,
    name varchar(100) NOT NULL,
    category varchar(20) NOT NULL,
    rating integer NOT NULL,
    description varchar(1000) NOT NULL
);
