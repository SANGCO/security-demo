package io.sangco.securitydemo.repository;

import io.sangco.securitydemo.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public class MemberRepository implements PagingAndSortingRepository<Member, Long> {
    @Override
    public Iterable<Member> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Member> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Member> S save(S s) {
        return null;
    }

    @Override
    public <S extends Member> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Member> findAll() {
        return null;
    }

    @Override
    public Iterable<Member> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Member member) {

    }

    @Override
    public void deleteAll(Iterable<? extends Member> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
