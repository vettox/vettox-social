CREATE TABLE apps.users
(
  user_uid character varying(256) NOT NULL,
  user_email character varying(256) NOT NULL,
  password character varying(256) NOT NULL,
  first_name character varying(256) NOT NULL,
  last_name character varying(256) NOT NULL,
  city character varying(256),
  birth_date date,
  photo_filename character varying(512),
  is_banned boolean NOT NULL DEFAULT false,
  CONSTRAINT users_pk PRIMARY KEY (user_uid)
)
WITH (
  OIDS=FALSE
);

-- ---------------------------------

CREATE TABLE apps.relationships
(
  user_uid character varying(256) NOT NULL,
  friend_uid character varying(256) NOT NULL,
  CONSTRAINT relationships_pk PRIMARY KEY (user_uid, friend_uid),
  CONSTRAINT users_to_relationships_fk FOREIGN KEY (user_uid)
      REFERENCES apps.users (user_uid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT users_to_relationships_fk_2 FOREIGN KEY (friend_uid)
      REFERENCES apps.users (user_uid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);

-- ---------------------------------

CREATE TABLE apps.conversations
(
  conversation_uid character varying(256) NOT NULL,
  first_user_uid character varying(256) NOT NULL,
  second_user_uid character varying(256) NOT NULL,
  CONSTRAINT convesations_pk PRIMARY KEY (conversation_uid),
  CONSTRAINT conversations_to_users_fk FOREIGN KEY (first_user_uid)
      REFERENCES apps.users (user_uid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT conversations_to_users_fk_2 FOREIGN KEY (second_user_uid)
      REFERENCES apps.users (user_uid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE apps.conversations
  OWNER TO postgres;

-- ---------------------------------

CREATE TABLE apps.messages
(
  message_uid character varying(256) NOT NULL,
  conversation_uid character varying(256) NOT NULL,
  author_uid character varying(256) NOT NULL,
  message_text text NOT NULL,
  message_datetime timestamp with time zone NOT NULL,
  CONSTRAINT messages_pk PRIMARY KEY (message_uid),
  CONSTRAINT messages_to_conversations_fk FOREIGN KEY (conversation_uid)
      REFERENCES apps.conversations (conversation_uid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
