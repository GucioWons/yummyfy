FROM quay.io/keycloak/keycloak:26.2

COPY ./providers /opt/keycloak/providers

RUN /opt/keycloak/bin/kc.sh build

ENTRYPOINT ["/opt/keycloak/bin/kc.sh"]