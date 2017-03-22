# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table player (
  pid                           varchar(255) not null,
  num                           integer,
  fname                         varchar(255),
  lname                         varchar(255),
  pos                           varchar(255),
  club                          varchar(255),
  age                           integer,
  apps                          integer,
  points                        integer,
  yellows                       integer,
  blacks                        integer,
  reds                          integer,
  constraint pk_player primary key (pid)
);


# --- !Downs

drop table if exists player;

