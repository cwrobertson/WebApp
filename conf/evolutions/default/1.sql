# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table register_model (
  id                        bigint auto_increment not null,
  firstname                 varchar(255),
  lastname                  varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  constraint uq_register_model_username unique (username),
  constraint pk_register_model primary key (id))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists register_model;

SET REFERENTIAL_INTEGRITY TRUE;

