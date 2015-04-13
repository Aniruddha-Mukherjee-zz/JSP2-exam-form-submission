CREATE TABLE student
(
  exam_roll_no numeric(32,0) NOT NULL,
  class_roll_no numeric,
  name text,
  reg_no text,
  email_id text,
  payment_id text,
  subjects text,
  CONSTRAINT pk_student PRIMARY KEY (exam_roll_no)
)
