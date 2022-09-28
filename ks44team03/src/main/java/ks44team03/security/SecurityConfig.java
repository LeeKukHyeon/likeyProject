package ks44team03.security;

  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.context.annotation.PropertySource; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import org.springframework.security.config.annotation.web.configuration.
  EnableWebSecurity; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.password.PasswordEncoder; import
  org.springframework.security.web.SecurityFilterChain;
  
  // Configuration은 스프링의 환경설정 파일임을 의미하는데, 스프링시큐리티설정을위해 사용
  
  @Configuration
  
  @PropertySource("classpath:/application.properties")
  
  @EnableWebSecurity public class SecurityConfig {
  
  @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
  Exception { http.authorizeRequests().antMatchers("/**").permitAll(); return
  http.build(); }
  
  @Bean public PasswordEncoder passwordEncoder() { return new
  BCryptPasswordEncoder(); } }
 