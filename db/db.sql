--many to many relation so, creating a combined table with both pk id

create table brand_owner_influencer (
    brand_owner_id int not null,
    influencer_id int not null,

    constraint pk_brand_influencer (brand_owner_id, influencer_id),
    constraint fk_boi_brand_owner_id foreign key (brand_owner_id) reference brand (id),
    constraint fk_boi_influencer_id foreign key (influencer_id) reference influencer (id)
);


insert into influencer (name, user_name, phone, nationality, country, city, gender, field_oi, status, tag, service_type)
values ("Nadir", "onthego", "01988392", "Bangladeshi", "Bangladesh", "Dhaka", "Male", "Travel", "Available", "content creator", "YouTube Promo"),
("Salman Muktadir", "brownfish", "0145348392", "Bangladeshi", "Bangladesh", "Dhaka", "Male", "Controversy", "Not Available", "content creator", "Story Highlights Promo");


insert into brand (brand_name, owner_name, phone)
values ("Miniso", "Mina", "090980"),
("Pizzaburg", "Raju", "8376871");

insert into brand_influencer(b_id, i_id)
values (1, 1), (1, 2), (2, 1);
