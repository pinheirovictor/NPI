<template>
  <div>
    <v-card-widget enableActions :title="'Página Inicial'">
      <div slot="widget-header-action">

      </div>
      <div slot="widget-content">
        <v-row>
          <v-col cols="12">
            <v-data-table
                    :headers="headers"
                    :items="usuarios"
                    :items-per-page="5"
                    class="elevation-1"
            >
              <template v-slot:item.habilitado="{ item }">
                <v-switch value input-value='item.habilitado' disabled></v-switch>
              </template>

              <template v-slot:item.editar="{ item }">
                <v-icon>edit</v-icon>
              </template>

              <template v-slot:item.deletar="{ item }">
                <v-icon>delete</v-icon>
              </template>

            </v-data-table>
          </v-col>
        </v-row>
      </div>
    </v-card-widget>
  </div>
</template>

<script>
// @ is an alias to /src
import VCardWidget from "@/components/VWidget";
import {RepositoryFactory} from "@/repositories/RepositoryFactory";
const usuarioRepo = RepositoryFactory.get("usuario");

export default {
  name: 'home',
  components: {
    VCardWidget
  },

  data: () => ({
    headers: [
      {
        text: 'Nome',
        align: 'left',
        value: 'nome',
      },
      {
        text: 'Email',
        value: 'email'
      },
      {
        text: 'Habilitado',
        value: 'habilitado'
      },
      {
        text: 'Editar',
        value: 'editar'
      },
      {
        text: 'Deletar',
        value: 'deletar'
      }
    ],
    usuarios :[

    ]
  }),

  created() {
    usuarioRepo.getAll().then(res => {
      this.usuarios = res.data;
    }).catch(console.error);
  },

  computed: {

  },

  methods: {

  }
}
</script>
