CREATE TABLE pro(
    id int auto_increment primary key,
    age int not null,
    education_level varchar(255) not null,
    referral_code varchar(255),
    writing_score decimal(2,1),
    internet_test_id int not null,
    past_experiences_id int not null,
    FOREIGN KEY (internet_test_id) REFERENCES internet_test(id),
    FOREIGN KEY (past_experiences_id) REFERENCES past_experiences(id)
);