insert into page (id, "text") values
  (1, 'Begining of Test Story'),
  (2, 'End of Test Story');

insert into book (id, "name", page_id) values
  (1, 'Test Book Title', 1);

insert into page_choices (page_id, choices_id, choices_key) values
  (1, 2, 'Test Choice');