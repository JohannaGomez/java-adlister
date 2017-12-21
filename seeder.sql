USE adlister2_db;


INSERT INTO users (username, email, password)
VALUES ('joe', 'joe@example.com', 'joe1'),
  ('sally', 'sally@example.com', 'sally1'),
  ('adam', 'adam@example.com', 'adam1'),
  ('jane', 'jane@example.com', 'jane1'),
  ('mike', 'mike@example.com', 'mike1');

INSERT INTO ads (title, description, user_id)
VALUES ('Photo Session', 'Get your Christmas pictures with us', 1),
  ('PlayStation', 'PS2 in great condition', 1),
  ('Mini Photo Session', 'Family pictures for everyone', 2),
  ('Web Developer', 'Work with us for free and get a lot of experience', 3),
  ('SawTable101', 'like new, you can get it toda!', 4),
  ('Pillow', 'Silk fabric and 2 accent pillows', 5),
  ('Arcade', 'ARCADE BOXING MACHINE $2800 Medial Center', 5);