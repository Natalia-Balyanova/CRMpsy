package ru.gb.CRMpsy.repository.specifications;

import org.springframework.data.jpa.domain.Specification;
import ru.gb.CRMpsy.entities.Psychologies;

public class PsychologiesSpecifications {

    public static Specification<Psychologies> birthdayGreaterOrEqualsThan(Integer birthday) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("birthday"), birthday);
    }

    public static Specification<Psychologies> methodLike(String methodPart) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("method"), String.format("%%%s%%", methodPart));
    }

//    public static Specification<Psychologies> problemLike(String problemPart) {
//        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("problem"), String.format("%%%s%%", problemPart));
//    }

    public static Specification<Psychologies> problemEqual(String problemPart) {
        return (Specification<Psychologies>) (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("problem").get("title"), problemPart);
    }
}
